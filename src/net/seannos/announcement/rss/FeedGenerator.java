package net.seannos.announcement.rss;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

public class FeedGenerator {

	private Picker picker;
	private final String url;
	private String feedType;
	public static final String ENTRY_TITLE = "title";
	public static final String ENTRY_LINK = "link";
	public static final String ENTRY_DATETIME = "datetime";
	private final String description;

	public FeedGenerator(String url, Document dom, String feedType,
			String description) {
		this.url = url;
		this.feedType = feedType;
		this.description = description;
		picker = new Picker(dom);
	}

	public FeedGenerator(String url, Document dom, String description) {
		this(url, dom, "rss_2.0", description);
	}

	public void generate(Writer writer) throws IOException, FeedException, ParseException {
		SyndFeed feed = createFeed();

		createEntries(feed);

		SyndFeedOutput syndFeedOutput = new SyndFeedOutput();
		syndFeedOutput.output(feed, writer);
	}

	public void createEntries(SyndFeed feed) throws ParseException {
		List<Node> announcements = picker.getAnnouncements();
		ArrayList<SyndEntry> entries = new ArrayList<SyndEntry>();
		ArrayList<SyndContent> contents = new ArrayList<SyndContent>();
		SyndEntry entry = null;
		SyndContent content = null;
		for (Node node : announcements) {
			Map<String, Object> entryMap = picker.getEntryMap(node);
			entry = new SyndEntryImpl();

			content = new SyndContentImpl();
			contents.add(content);

			entry.setTitle((String) entryMap.get(ENTRY_TITLE));
			entry.setLink((String) entryMap.get(ENTRY_LINK));
			DateFormat dfm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			entry.setPublishedDate(dfm.parse((String)entryMap.get(ENTRY_DATETIME)));

			entry.setContents(contents);

			entries.add(entry);
		}
		feed.setEntries(entries);

	}

	private SyndFeed createFeed() {
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType(feedType);
		feed.setTitle(picker.getTitle());
		feed.setLink(url);
		feed.setDescription(description);
		return feed;
	}

}
