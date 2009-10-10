package net.seannos.announcement.rss;

import junit.framework.TestCase;
import org.w3c.dom.Document;

public class FetcherTest extends TestCase {
	public void testFetch_shoud_return_string(){
		Fetcher f = new Fetcher();
		String s = f.fetch("http://www.google.com/");
		assertNotNull(s);
		System.out.println(s); 
	}
}
