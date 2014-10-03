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
//Assim como todo link é formado por "schema://host/path" (http://www.abobrinha.com/path) 
//com a anotação "@path" definimos o "path" (caminho) que será incluso após o host 
//para acessar esta classe.
@Path("/helloworld")
public class HelloWorld{
	
//	//A partir da versão 2 do Jersey é necessário incluir o construtor nas classes
//	//acessíveis via REST invocando o método "packages" passando o pacote + nome da
//	//classe como parâmetro.
//	public HelloWord() {
//		packages("com.jonathan.zapzapws.HelloWord");
//	}
	
	//Este método será acessado via método "GET". Lembre-se, em protocolo HTTP o método
	//"GET" é utilizado para buscar coisas, o "PUT" para incluir, o "POST" para editar 
	//e "DELETE" para excluir.
	@GET
	//Indica que este método, ao ser chamado, retornará um texto comum.
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWordTexto() {
	  return "Hello Word!! (texto)";
	}

	//Este método será acessado via método "GET".
	@GET
	//Indica que este método, ao ser chamado, retornará um XML.
	@Produces(MediaType.TEXT_XML)
	public String helloWordXML() {
	  return "<?xml version=\"1.0\"?> "
	  		+ "<hello> Hello Word!! (xml) </hello>";
	}

	//Este método será acessado via método "GET".
	@GET
	//Indica que este método, ao ser chamado, retornará um HTML.
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
