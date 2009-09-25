package net.seannos.announcement.rss;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;
import net.seannos.announcement.rss.mock.AnnouncePageMock;
import net.seannos.announcement.rss.util.DomUtil;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ParserTest extends TestCase {
	public void test_parser_should_return_xml_dom_object() throws SAXException,
			IOException, ParserConfigurationException {
		Parser p = new Parser();
		Document d = p.parse(AnnouncePageMock.ANNOUNCE_PAGE);
		NodeList nodeList = d.getElementsByTagName("title");
		// System.out.println(nodeList.getLength());
		assertEquals("Announcements (Sean-nós)", nodeList.item(0)
				.getTextContent());
	}

//	public void test_dom_test() throws ParserConfigurationException,
//			SAXException, IOException {
//		Parser p = new Parser();
//		Document d = p.parse(AnnouncePageMock.ANNOUNCE_PAGE);
//		System.out.println(d.getChildNodes().item(1).getChildNodes()
//				.getLength());
//
//	}

//	public void test_xpath_practice() throws ParserConfigurationException,
//			SAXException, IOException, XPathExpressionException {
//
//		// try {
//
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		factory.setNamespaceAware(true);
//		DocumentBuilder builder = factory
//				.newDocumentBuilder();
//		builder.setEntityResolver(new EntityResolver() {
//			
//			@Override
//			public InputSource resolveEntity(String publicId, String systemId)
//					throws SAXException, IOException {
//			     if (systemId.equals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd")) {
//		              // return a special input source
//		       return new InputSource(new FileReader("resources/catalog.xml"));
//		     } else {
//		              // use the default behaviour
//		       return null;
//		     }
//		   }			
//		});
//		Document document = builder.parse("http://www.sean-nos.net/Home/announcement");
//
//		XPath xpath = XPathFactory.newInstance().newXPath();
//		String expression = "//year";
//
//		NodeList birthdateNode = (NodeList) xpath.evaluate(expression, document,
//				XPathConstants.NODESET);
//		System.out.println(birthdateNode.getLength());
//
//	}

//	public void test_xpath_test() throws Exception {
//		Parser p = new Parser();
//		Document d = p.parse(AnnouncePageMock.ANNOUNCE_PAGE);
//		// System.out.println(d.getNodeType()==Node.DOCUMENT_NODE);
//		// System.out.println(DomUtil.dom2String(d));
//		XPathFactory factory = XPathFactory.newInstance();
//		XPath xpath = factory.newXPath();
//		xpath.setNamespaceContext(new NamespaceContext() {
//
//			@Override
//			public Iterator getPrefixes(String namespaceURI) {
//				throw new UnsupportedOperationException();
//			}
//
//			@Override
//			public String getPrefix(String namespaceURI) {
//				throw new UnsupportedOperationException();
//			}
//
//			@Override
//			public String getNamespaceURI(String prefix) {
//				return "http://www.w3.org/1999/xhtml";
//			}
//		});
//		// xpath.compile("/html/body/div[2]/div/div/div[2]/div/table/tbody/tr/td/div/div[3]/div[2]/div");
//		// XPathExpression expr = xpath.compile("/");
//		// XPathExpression expr = xpath.compile("//HTML");
//		// String xpathString = "//DIV[@class='announcements']";
//		// String xpathString =
//		// "//HTML[@xmlns='http://www.w3.org/1999/xhtml']//DIV[@class='announcements']";
//		String xpathString = "//HTML";
//		NodeList list = (NodeList) xpath.evaluate(xpathString, d,
//				XPathConstants.NODESET);
//		// System.out.println(list.item(0).getFirstChild().getNodeName());
//		// System.out.println(DomUtil.dom2String(list.item(0)));
//		DomUtil.scanNodes(list);
//		assertEquals(1, list.getLength());
//	}

	public static Document getSampleDocument() {
		Parser p = new Parser();
		try {
			return p.parse(AnnouncePageMock.ANNOUNCE_PAGE);
		} catch (Exception e) {
			throw new SiteRssRuntimeException(e);
		}
	}

}
