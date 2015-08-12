package co.gov.colpensiones.processor;

import java.util.Map;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.gov.colpensiones.schemas._1_0.comun.TipoCredencialesAutorizacion;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroNuevo;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;

public class ProcesarTransformacion implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcesarTransformacion.class);
	
	@Override
	public void process(Exchange e) throws Exception {
		
		 Object body = e.getIn().getBody();
		 if (body instanceof TipoInformacionRegistroNuevo)
		 {
			 TipoInformacionRegistroNuevo tirn = (TipoInformacionRegistroNuevo)body;
			 log.info("BEAN TIPO INFORMACIÓN REGISTRO NUEVO");
			 log.info("tramite =" + tirn.getDetalle().getIdentificacionTRD().getTramite());
			 log.info("Subtramite =" + tirn.getDetalle().getIdentificacionTRD().getSubtramite());
			 log.info("Agrupador =" + tirn.getDetalle().getAgrupador());
			 
			 /*
			 TipoInformacionRegistroTRDDTO tirv = new TipoInformacionRegistroTRDDTO();
			 tirv.setDetalle(tirn.getDetalle());
			 TipoCredencialesAutorizacion contexto = new TipoCredencialesAutorizacion();
			 contexto.setNombreUsuarioNegocio("ELSENIOR");
			 tirv.setContexto(contexto);
			 e.getOut().setBody(tirv);
			 */
		 }
		 else if(body instanceof TipoInformacionRegistroTRDDTO)
		 {
			 log.info("BEAN TIPO DOCUMENTO TRDDTO");
			 TipoInformacionRegistroTRDDTO tirn = (TipoInformacionRegistroTRDDTO)body;
			 if (tirn.getDetalle() ==null)
				 
				 	log.info("Detalle NULL");
			 else
				 	log.info("Detalle no NULL");
				 	
			 
			 
			 
		 }
		 else
		 {
			 log.info("body.class.name != TipoInformacionRegistroNuevo");
		 }
		if (e.getIn().getAttachments() != null)
		{
			Map<String,DataHandler> adjuntos = e.getIn().getAttachments();
			log.info(Integer.toString(e.getIn().getAttachments().size()));
			
			for (Map.Entry<String, DataHandler> entry : adjuntos.entrySet())
			{
			    log.info(entry.getKey() + "/" + entry.getValue());
			}
		}
		else
			log.info("no llego ningún attachement");
		
				
				
		
	}

}
