package net.seannos.announcement.rss;

import junit.framework.TestCase;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class PickerTest extends TestCase {

	private Picker p;
	
	public void setUp() {
		p = new Picker(ParserTest.getSampleDocument());
	}
	
	public void test_picker_should_pick_title(){
		assertEquals("Announcements (Sean-nós)",p.getTitle());
	}
	public void test_picker_should_pick_entries(){
		NodeList anouncements = p.getAnnouncements();
		assertEquals(1,anouncements.getLength());
	}
}  
