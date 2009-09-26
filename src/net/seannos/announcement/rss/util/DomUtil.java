package net.seannos.announcement.rss.util;

import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomUtil {

	public static String dom2String(Document d) {
		try {
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer();
			StringWriter sw = new StringWriter();
			transformer.transform(new DOMSource(d), new StreamResult(sw));
			return sw.toString();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public static String node2String(Node n) {
		try {
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer();
			StringWriter sw = new StringWriter();
			transformer.transform(new DOMSource(n), new StreamResult(sw));
			return sw.toString();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";

	}

	public static void scanNodes(NodeList nodeList) throws Exception {
		scanNodes(nodeList, 1);
	}

	public static void scanNode(Node node) throws Exception {
		int level = 1;
		String s = String.format("%" + level * 2 + "s", " ");
		scanNode(level, s, node);
	}

	private static void scanNodes(NodeList nodeList, int level)
			throws Exception {
		String s = String.format("%" + level * 2 + "s", " ");
		try {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				level = scanNode(level, s, node);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static int scanNode(int level, String s, Node node)
			throws Exception {
		String nodeName = node.getNodeName();
		String nodeValue = node.getNodeValue();
		System.out.println(s + nodeName + "    " + nodeValue);
		if (Node.ELEMENT_NODE == node.getNodeType()) {
			NamedNodeMap nodeMap = node.getAttributes();
			if (null != nodeMap) {
				for (int j = 0; j < nodeMap.getLength(); j++) {
					String attributeName = nodeMap.item(j).getNodeName();
					String attributeValue = nodeMap.item(j).getNodeValue();
					System.out.println(s + "  " + attributeName + "    "
							+ attributeValue);
				}
			}
		}
		if (true == node.hasChildNodes()) {
			scanNodes(node.getChildNodes(), ++level);
		}
		return level;
	}
}
