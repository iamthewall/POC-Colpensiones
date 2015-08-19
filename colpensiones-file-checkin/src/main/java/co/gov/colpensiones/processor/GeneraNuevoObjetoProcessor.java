package co.gov.colpensiones.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.gov.colpensiones.schemas._1_0.comun.TipoCredencialesAutorizacion;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroNuevo;
import co.gov.colpensiones.schemas._1_0.personas.TipoInformacionRegistroTRDDTO;

public class GeneraNuevoObjetoProcessor implements Processor {

	public void process(Exchange e) throws Exception 
	{
		
		 Object body = e.getIn().getBody();
		 if (body instanceof TipoInformacionRegistroNuevo)
		 {
			 TipoInformacionRegistroNuevo tirn = (TipoInformacionRegistroNuevo)body;
			 
			 TipoInformacionRegistroTRDDTO tirv = new TipoInformacionRegistroTRDDTO();
			 tirv.setDetalle(tirn.getDetalle());
			 
			 TipoCredencialesAutorizacion contexto = new TipoCredencialesAutorizacion();			 
			 contexto.setNombreUsuarioNegocio(e.getContext().resolvePropertyPlaceholders("{{login.nombreUsuarioNegocio}}"));
			 contexto.setNombreUsuarioSistema(e.getContext().resolvePropertyPlaceholders("{{login.nombreUsuarioSistema}}"));
			 contexto.setClaveUsuarioSistema(e.getContext().resolvePropertyPlaceholders("{{login.claveUsuarioSistema}}"));
			 
			 tirv.setContexto(contexto);
			 e.getOut().setAttachments(e.getIn().getAttachments());
			 e.getOut().setBody(tirv);
			 
		 }
	}

}
