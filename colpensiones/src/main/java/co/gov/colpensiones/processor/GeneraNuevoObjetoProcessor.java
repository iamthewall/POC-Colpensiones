package co.gov.colpensiones.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.gov.colpensiones.schemas._1_0.comun.TipoCredencialesAutorizacion;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroNuevo;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;

public class GeneraNuevoObjetoProcessor implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(GeneraNuevoObjetoProcessor.class);
	
	@Override
	public void process(Exchange e) throws Exception 
	{
		
		 Object body = e.getIn().getBody();
		 if (body instanceof TipoInformacionRegistroNuevo)
		 {
			 TipoInformacionRegistroNuevo tirn = (TipoInformacionRegistroNuevo)body;
			 
			 TipoInformacionRegistroTRDDTO tirv = new TipoInformacionRegistroTRDDTO();
			 tirv.setDetalle(tirn.getDetalle());
			 TipoCredencialesAutorizacion contexto = new TipoCredencialesAutorizacion();
			 contexto.setNombreUsuarioNegocio("ELSENIOR");
			 tirv.setContexto(contexto);
			 e.getOut().setBody(tirv);
		 }
	}

}
