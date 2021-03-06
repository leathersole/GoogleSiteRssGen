package net.seannos.announcement.rss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.seannos.announcement.rss.util.DomUtil;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Picker picks elements that FeedGenerator needs from Dom.
 * @author KONISHI Takayuki
 *
 */
public class Picker {

	private final Document dom;
	private List<Node> announcements = new ArrayList<Node>();
	public static final char LEFT_TO_RIGHT_MARK = 0x200e;

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
						addEntryTitleAndLink(entryMap, node, nodeName,
								attributeName, attributeValue);
						addCreateDate(entryMap, node, nodeName, attributeName,
								attributeValue);
						addContent(entryMap, node, nodeName, attributeName,
								attributeValue);
					}
				}
			}
			if (true == node.hasChildNodes()) {
				pickEntryElements(node.getChildNodes(), entryMap);
			}
		}
	}

	private static void addContent(Map<String, Object> entryMap, Node node,
			String nodeName, String attributeName, String attributeValue) {
		if ("TD".equals(nodeName)
				&& "class".equals(attributeName)
				&& "sites-layout-tile sites-tile-name-content-1"
						.equals(attributeValue)) {
			entryMap.put(FeedGenerator.CONTENT_VALUE, DomUtil.node2String(
					node.getFirstChild()).replaceFirst(
					"<\\?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"\\?>",
					""));

		}
	}

	private static void addEntryTitleAndLink(Map<String, Object> entryMap,
			Node node, String nodeName, String attributeName,
			String attributeValue) {
		if (isTitle(nodeName, attributeName, attributeValue)
				&& false == entryMap.containsKey(FeedGenerator.ENTRY_TITLE)) {
			entryMap.put(FeedGenerator.ENTRY_TITLE, node.getTextContent());
			entryMap.put(FeedGenerator.ENTRY_LINK, attributeValue);
		}
	}

	private static void addCreateDate(Map<String, Object> entryMap, Node node,
			String nodeName, String attributeName, String attributeValue) {
		if ("SPAN".equals(nodeName) && "xmlns".equals(attributeName)) {
			System.out.println("[" + node.getTextContent() + "]");
			if (node.getTextContent().matches(
					".*?\\d{4}/\\d{2}/\\d{2}\\s\\d{1,2}:\\d{2}.*?")
					) {
				String value = replaceUnicodeFormatControlCharacters(node
						.getTextContent());
				// System.out.println("[[" + value + "]]");
				entryMap.put(FeedGenerator.ENTRY_DATETIME, value);
			}
		}
	}

	private static String replaceUnicodeFormatControlCharacters(
			String textContent) {
		return textContent.replaceAll(String.valueOf(LEFT_TO_RIGHT_MARK), "");
	}

	private static boolean isTitle(String nodeName, String attributeName,
			String attributeValue) {
		return "A".equals(nodeName) && "href".equals(attributeName)
				&& attributeValue.startsWith("/Home/announcement/");
	}
}
