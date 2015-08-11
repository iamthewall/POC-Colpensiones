package co.gov.colpensiones.processor;

import java.util.Map;

import javax.activation.DataHandler;

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
		
		 DataHandler dr = e.getIn().getAttachment("Demo Overview.pdf");
		 
		 if (dr != null)
			 log.info("el archivo esta");
		 else
			 log.info("el archivo no esta");
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
