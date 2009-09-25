package net.seannos.announcement.rss;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Picker {

	private final Document dom;

	public Picker(Document dom) {
		this.dom = dom;
	}

	public String getTitle() {
		NodeList nodeList = dom.getElementsByTagName("title");

		if (nodeList.getLength() != 1) {
			throw new SiteRssRuntimeException();
		}
		return nodeList.item(0).getTextContent();
	}

	public NodeList getAnnouncements() {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		try {
			XPathExpression expr = xpath
					.compile("/html//div[@class='announcement']");
			return (NodeList) expr.evaluate(dom, XPathConstants.NODESET);

		} catch (XPathExpressionException e) {
			throw new SiteRssRuntimeException(e);
		}

	}

}
