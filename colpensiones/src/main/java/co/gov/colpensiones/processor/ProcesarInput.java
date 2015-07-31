package co.gov.colpensiones.processor;

public class ProcesarInput {
	public String doSomething(String body)
	{		
		body = body
				.replaceAll("<per:InformacionRegistroNuevo>", 
						"<per:InformacionRegistroTRDDTO>\n" +
				"\t\t<per1:Contexto> \n" +
				"\t\t\t<com:nombreUsuarioNegocio>INTBIZAGIECM</com:nombreUsuarioNegocio>\n" +
				"\t\t\t<com:nombreUsuarioSistema>INTBIZAGIECM</com:nombreUsuarioSistema>\n" +
				"\t\t\t<com:claveUsuarioSistema>Gesd927WS</com:claveUsuarioSistema>\n" +
				"\t\t</per1:Contexto>")
				.replaceAll("/per:InformacionRegistroNuevo>", "</per:InformacionRegistroTRDDTO>");
		return body;
	}
}
