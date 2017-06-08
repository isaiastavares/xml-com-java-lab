package br.com.alura.test;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ConversorXmlParaHtmlComXSL {

	public static void main(String[] args) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();

		InputStream template = new FileInputStream("src/main/resources/xmlParaHtml.xsl");
		StreamSource stylesheet = new StreamSource(template);
		Transformer transformer = factory.newTransformer(stylesheet);

		InputStream vendas = new FileInputStream("src/main/resources/venda.xml");
		StreamSource source = new StreamSource(vendas);
		StreamResult result = new StreamResult("src/main/resources/venda.html");
		transformer.transform(source, result);
	}

}
