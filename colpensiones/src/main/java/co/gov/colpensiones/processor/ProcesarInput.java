package co.gov.colpensiones.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class ProcesarInput implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(ProcesarInput.class);
	

	
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("Este es el original:" + exchange.getIn().getBody(String.class));
	}
}
