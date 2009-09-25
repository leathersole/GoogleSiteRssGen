package net.seannos.announcement.rss;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import net.seannos.announcement.rss.util.DomUtil;

import org.w3c.dom.Node;


public class PickerTest extends TestCase {

	private Picker p;
	
	public void setUp() {
		p = new Picker(ParserTest.getSampleDocument());
	}
	
	public void test_picker_should_pick_title(){
		assertEquals("Announcements (Sean-nós)",p.getTitle());
	}
	public void test_picker_should_pick_entries(){
		List<Node> anouncements = p.getAnnouncements();
		assertEquals(10,anouncements.size());
	}
	public void test_picker_should_pick_entry_title() throws Exception{
		Node n=p.getAnnouncements().get(0);
		DomUtil.scanNode(n);
		Map<String, Object> entryMap = p.getEntryMap(n);
		assertEquals("10月の予定を追加", entryMap.get(FeedGenerator.ENTRY_TITLE));
		assertEquals("/Home/announcement/10tsukinoyoteiwotsuika", entryMap.get(FeedGenerator.ENTRY_LINK));
		assertEquals("‎2009/09/23 18:23‎", entryMap.get(FeedGenerator.ENTRY_DATETIME));
	}
	public void test_regex(){
		assertTrue("2009‎".matches("2009.*"));
		assertTrue("2009/09/23‎".matches("\\d{4}/\\d{2}/\\d{2}.*"));
		assertTrue("2009/09/23 18:23‎‎".matches("\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}.*"));
	}
}  
