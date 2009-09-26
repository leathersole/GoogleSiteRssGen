package net.seannos.announcement.rss;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;
import net.seannos.announcement.rss.util.DomUtil;

import org.w3c.dom.Node;

import sun.misc.HexDumpEncoder;


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
		assertEquals("<DIV dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">10月の練習会の予定を追加しました。<DIV>9月に引き続き、12:00〜12:30を未経験あるいは初心者のための時間としています。</DIV><DIV>初めての方はぜひこの時間からおいで下さい。</DIV></DIV>", entryMap.get(FeedGenerator.CONTENT_VALUE));
		
		assertEquals("‎2009/09/23 18:23".replaceAll(String.valueOf(Picker.LEFT_TO_RIGHT_MARK), ""), entryMap.get(FeedGenerator.ENTRY_DATETIME));
	}
	public void test_regex(){
		assertTrue("2009‎".matches("2009.*"));
		assertTrue("2009/09/23‎".matches("\\d{4}/\\d{2}/\\d{2}.*"));
		System.out.println("2009/09/23 18:23‎‎".replaceAll(".*?(\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}).*?", "$1").getBytes());
//		assertTrue("2009/09/23 18:23‎‎".replaceAll(".*?(\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}).*?", "$1").matches("\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}"));
		char c = 0x200e;
		assertTrue("2009/09/23 18:23‎‎".replaceAll(String.valueOf(c), "").matches("\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}"));
	}
}  
