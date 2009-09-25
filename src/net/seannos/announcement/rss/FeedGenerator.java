package net.seannos.announcement.rss;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.w3c.dom.Document;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

public class FeedGenerator {

	// private SyndFeed feed = new SyndFeedImpl();
	private Picker picker;
	private final String url;
	private String feedType;

	public FeedGenerator(String url, Document dom, String feedType) {
		this.url = url;
		this.feedType = feedType;
		picker = new Picker(dom);
	}

	public FeedGenerator(String url, Document dom) {
		this(url, dom, "rss_2.0");
	}

	public void generate(Writer writer) throws IOException, FeedException {
		SyndFeed feed = createFeed();
		
		createEntries(feed);

		SyndFeedOutput syndFeedOutput = new SyndFeedOutput();
		syndFeedOutput.output(feed, writer);
	}

	private void createEntries(SyndFeed feed) {
		
	}

	private SyndFeed createFeed() {
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType(feedType);
		feed.setTitle(picker.getTitle());
		feed.setLink(url);
		return feed;
	}

}
