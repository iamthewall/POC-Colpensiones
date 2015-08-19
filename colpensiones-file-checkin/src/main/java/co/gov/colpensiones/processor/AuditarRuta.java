package co.gov.colpensiones.processor;

import java.util.Map;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroNuevo;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;

public class AuditarRuta implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(AuditarRuta.class);
	
	@Override
	public void process(Exchange e) throws Exception {
		
		 Object body = e.getIn().getBody();
		 log.info("ESTE ES EL HEADER Op Name=" + e.getIn().getHeader("operationName") + "\n ESTE ES EL HEADER SOAPAction ="+ e.getIn().getHeader("SOAPAction") + "\n ESTE ES EL BODY = "+ e.getIn().getBody().toString());
		 if (body instanceof TipoInformacionRegistroNuevo)
		 {
			 TipoInformacionRegistroNuevo tirn = (TipoInformacionRegistroNuevo)body;
			 log.info("BEAN TIPO INFORMACIÓN REGISTRO NUEVO");
			 log.info("tramite =" + tirn.getDetalle().getIdentificacionTRD().getTramite());
			 log.info("Subtramite =" + tirn.getDetalle().getIdentificacionTRD().getSubtramite());
			 log.info("Agrupador =" + tirn.getDetalle().getAgrupador());
			 log.info("Contenido =" + tirn.getDetalle().getDocumentos().getDocumento().get(0).getContenido());
		 }
		 else if(body instanceof TipoInformacionRegistroTRDDTO)
		 {
			 log.info("BEAN TIPO DOCUMENTO TRDDTO");
			 TipoInformacionRegistroTRDDTO tirn = (TipoInformacionRegistroTRDDTO)body;			 
			 if (tirn.getDetalle() ==null)			 			 
				 	log.info("Detalle NULL");
			 else
			 {
				 log.info("tramite =" + tirn.getDetalle().getIdentificacionTRD().getTramite());
				 log.info("Subtramite =" + tirn.getDetalle().getIdentificacionTRD().getSubtramite());
				 log.info("Agrupador =" + tirn.getDetalle().getAgrupador());
				 log.info("Contenido =" + tirn.getDetalle().getDocumentos().getDocumento().get(0).getContenido());				 
			 }
			 if(tirn.getContexto()!= null)			 
				 log.info("Nombre Usuario Negocio=" + tirn.getContexto().getNombreUsuarioNegocio());
			 else
				 log.info("Contexto NULL");
				 	
				
		 }
		 else
		 {
			 log.info("body.class.name != TipoInformacionRegistroNuevo");
		 }
		if (e.getIn().getAttachments() != null)
		{
			Map<String,DataHandler> adjuntos = e.getIn().getAttachments();
			log.info("NÚMERO DE ARCHIVOS="+Integer.toString(e.getIn().getAttachments().size()));
			
			for (Map.Entry<String, DataHandler> entry : adjuntos.entrySet())
			{
			    log.info("NOMBRE DEL ARCHIVO="+entry.getKey() + "/" + entry.getValue());
			}
		}
		else
			log.info("no llego ningún attachement");
		
				
				
		
	}

}
