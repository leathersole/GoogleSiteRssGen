package net.seannos.announcement.rss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Picker {

	private final Document dom;
	private List<Node> announcements = new ArrayList<Node>();

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

	public List<Node> getAnnouncements() {
		pickAnnouncements(dom.getChildNodes(), announcements);
		return announcements;
	}

	private static void pickAnnouncements(NodeList nodeList,
			List<Node> announcements) {
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			String nodeName = node.getNodeName();
			if (Node.ELEMENT_NODE == node.getNodeType()) {
				NamedNodeMap nodeMap = node.getAttributes();
				if (null != nodeMap) {
					for (int j = 0; j < nodeMap.getLength(); j++) {
						String attributeName = nodeMap.item(j).getNodeName();
						String attributeValue = nodeMap.item(j).getNodeValue();
						if ("DIV".equals(nodeName)
								&& "class".equals(attributeName)
								&& "announcement".equals(attributeValue)) {
							announcements.add(node);
							break;
						}
					}
				}
			}
			if (true == node.hasChildNodes()) {
				pickAnnouncements(node.getChildNodes(), announcements);
			}
		}
	}

	public Map<String, Object> getEntryMap(Node node) {
		validateAnnouncementNode(node);
		HashMap<String, Object> entryMap = new HashMap<String, Object>();
		pickEntryElements(node.getChildNodes(), entryMap);

		return entryMap;
	}

	private void validateAnnouncementNode(Node node) {
		String nodeName = node.getNodeName();
		NamedNodeMap nodeMap = node.getAttributes();
		boolean valid = false;
		for (int j = 0; j < nodeMap.getLength(); j++) {
			String attributeName = nodeMap.item(j).getNodeName();
			String attributeValue = nodeMap.item(j).getNodeValue();
			if ("DIV".equals(nodeName) && "class".equals(attributeName)
					&& "announcement".equals(attributeValue)) {
				valid = true;
				break;
			}
		}
		if (!valid) {
			throw new IllegalArgumentException("announcementをルートとするノードを引数とします。");
		}
		for (int j = 0; j < nodeMap.getLength(); j++) {
			String attributeName = nodeMap.item(j).getNodeName();
			String attributeValue = nodeMap.item(j).getNodeValue();
			if ("DIV".equals(nodeName) && "class".equals(attributeName)
					&& "announcement".equals(attributeValue)) {
				valid = true;
				break;
			}
		}
	}

	private static void pickEntryElements(NodeList nodeList,
			Map<String, Object> entryMap) {
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			String nodeName = node.getNodeName();
			if (Node.ELEMENT_NODE == node.getNodeType()) {
				NamedNodeMap nodeMap = node.getAttributes();
				if (null != nodeMap) {
					for (int j = 0; j < nodeMap.getLength(); j++) {
						String attributeName = nodeMap.item(j).getNodeName();
						String attributeValue = nodeMap.item(j).getNodeValue();
						if (isTitle(nodeName, attributeName, attributeValue)
								&& false == entryMap
										.containsKey(FeedGenerator.ENTRY_TITLE)) {
							entryMap.put(FeedGenerator.ENTRY_TITLE, node
									.getTextContent());
							entryMap.put(FeedGenerator.ENTRY_LINK,
									attributeValue);
						}
						if ("NOSCRIPT".equals(nodeName)) {
							System.out.println("[" + node.getTextContent() + "]");
							if (node.getTextContent().matches(
									".*?\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}.*?")) {
								entryMap.put(FeedGenerator.ENTRY_DATETIME, node
										.getTextContent());
							}
						}
					}
				}
			}
			if (true == node.hasChildNodes()) {
				pickEntryElements(node.getChildNodes(), entryMap);
			}
		}
	}

	private static boolean isTitle(String nodeName, String attributeName,
			String attributeValue) {
		return "A".equals(nodeName) && "href".equals(attributeName)
				&& attributeValue.startsWith("/Home/announcement/");
	}
}
