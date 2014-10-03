package com.jonathan.zapzapws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author jonathan.s.santos
 *
 * @version 03/10/2014
 * @project ZapZap-WS
 */
//Assim como todo link � formado por "schema://host/path" (http://www.abobrinha.com/path) 
//com a anota��o "@path" definimos o "path" (caminho) que ser� incluso ap�s o host 
//para acessar esta classe.
@Path("/helloworld")
public class HelloWorld{
	
//	//A partir da vers�o 2 do Jersey � necess�rio incluir o construtor nas classes
//	//acess�veis via REST invocando o m�todo "packages" passando o pacote + nome da
//	//classe como par�metro.
//	public HelloWord() {
//		packages("com.jonathan.zapzapws.HelloWord");
//	}
	
	//Este m�todo ser� acessado via m�todo "GET". Lembre-se, em protocolo HTTP o m�todo
	//"GET" � utilizado para buscar coisas, o "PUT" para incluir, o "POST" para editar 
	//e "DELETE" para excluir.
	@GET
	//Indica que este m�todo, ao ser chamado, retornar� um texto comum.
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWordTexto() {
	  return "Hello Word!! (texto)";
	}

	//Este m�todo ser� acessado via m�todo "GET".
	@GET
	//Indica que este m�todo, ao ser chamado, retornar� um XML.
	@Produces(MediaType.TEXT_XML)
	public String helloWordXML() {
	  return "<?xml version=\"1.0\"?> "
	  		+ "<hello> Hello Word!! (xml) </hello>";
	}

	//Este m�todo ser� acessado via m�todo "GET".
	@GET
	//Indica que este m�todo, ao ser chamado, retornar� um HTML.
	@Produces(MediaType.TEXT_HTML)
	public String helloWordHTML() {
	  return "<html>"
	  			+ "<title>Hello Word</title> "
	  			+ "<body>"
	  				+ "<h1>Hello Word (html)</h1>"
	  			+ "</body>"
	  		+ "</html> ";
	}
}
