package net.seannos.announcement.rss;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import net.seannos.announcement.rss.util.DomUtil;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class ControllerTest extends TestCase {
	public void test_prepare_fecher_and_parser() throws Exception{
		Fetcher f = new Fetcher();
		Parser p = new Parser();
		Document d = p.parse(f.fetch("http://sites.google.com/a/sean-nos.net/info/Home/announcement"));
	}
}
