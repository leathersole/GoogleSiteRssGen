package net.seannos.announcement.rss;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;

import org.cyberneko.html.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Parser {

	public Document parse(String xhtml) throws ParserConfigurationException, SAXException, IOException {
		StringReader strReader = new StringReader(xhtml);
		DOMParser parser = new DOMParser();
		parser.parse(new InputSource(strReader));
		return parser.getDocument();
	}

}
