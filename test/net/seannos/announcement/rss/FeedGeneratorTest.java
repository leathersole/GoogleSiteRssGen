package net.seannos.announcement.rss;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.sun.syndication.io.FeedException;

import junit.framework.TestCase;

public class FeedGeneratorTest extends TestCase {
	public void test_generate_should_return_rss_string() throws IOException,
			FeedException, ParseException {
		FeedGenerator gen = new FeedGenerator(
				"http://www.sean-nos.net/Home/announcement", ParserTest
						.getSampleDocument(), "説明です。");
		StringWriter writer = new StringWriter();
		gen.generate(writer);
		String rss = writer.toString();
		assertNotNull(rss);
		System.out.println(rss);
	}

	public void test_parse_date() throws ParseException {
		DateFormat dfm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = dfm.parse("2009/01/01 23:55");
		dfm = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.JAPAN);
		dfm.parse("2009/09/23 18:23");

	}

	public void test_modifyLink() {
		String string = "/Home/announcement/10tsukinoyoteiwotsuika";
		String url = "http://www.sean-nos.net/Home/announcement";
		int indexOf = url.indexOf("://");
		System.out.println(indexOf);
		int indexOf2 = url.indexOf("/", indexOf + 3);
		System.out.println(indexOf2);
		String result = url.substring(0, indexOf2) + string;
		assertEquals(
				"http://www.sean-nos.net/Home/announcement/10tsukinoyoteiwotsuika",
				result);
	}

}
