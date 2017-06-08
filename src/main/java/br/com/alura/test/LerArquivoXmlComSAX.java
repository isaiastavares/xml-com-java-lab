package br.com.alura.test;

import java.io.FileInputStream;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import br.com.alura.handlers.ProdutosHandler;

public class LerArquivoXmlComSAX {

	public static void main(String[] args) throws Exception {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ProdutosHandler handler = new ProdutosHandler();
		reader.setContentHandler(handler);

		InputStream is = new FileInputStream("src/main/resources/venda.xml");
		InputSource arquivo = new InputSource(is);

		reader.parse(arquivo);

		System.out.println(handler.getProdutos());
	}

}
