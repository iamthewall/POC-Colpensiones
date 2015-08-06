package co.gov.colpensiones.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcesarTransformacion implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcesarTransformacion.class);
	
	@Override
	public void process(Exchange entrada) throws Exception {
		
		log.info("Entre");
		log.info(entrada.getIn().getBody().toString());
		
	}

}
