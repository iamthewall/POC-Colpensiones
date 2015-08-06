package co.gov.colpensiones.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;

public class ProcesarTransformacion implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcesarTransformacion.class);
	
	@Override
	public void process(Exchange e) throws Exception {
		
		log.info("Entre");
		log.info(e.getIn().getBody().toString());
		TipoInformacionRegistroTRDDTO entrada = e.getIn().getBody(TipoInformacionRegistroTRDDTO.class);
		log.info(entrada.toString());
		log.info(entrada.getDetalle().toString());
		
		
				
				
		
	}

}
