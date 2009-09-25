package net.seannos.announcement.rss;

import java.io.IOException;
import java.io.StringWriter;

import com.sun.syndication.io.FeedException;

import junit.framework.TestCase;

public class FeedGeneratorTest extends TestCase {
	public void test_generate_should_return_rss_string() throws IOException,
			FeedException {
		FeedGenerator gen = new FeedGenerator("http://www.yahoo.com",
				ParserTest.getSampleDocument());
		StringWriter writer = new StringWriter();
		gen.generate(writer);
		String rss = null;
		writer.write(rss);
		assertNotNull(rss);
	}
}
