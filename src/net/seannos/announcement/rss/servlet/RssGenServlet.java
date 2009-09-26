package net.seannos.announcement.rss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.seannos.announcement.rss.FeedGenerator;
import net.seannos.announcement.rss.Fetcher;
import net.seannos.announcement.rss.Parser;

@SuppressWarnings("serial")
public class RssGenServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		// String parameter = req.getParameter("announcement_page_url");
		// String description =
		// req.getParameter("announcement_page_description");
		String parameter = "http://www.sean-nos.net/Home/announcement";
		String description = "Sean-nós danceのページの更新情報です。";
		// System.out.println(parameter);
		// System.out.println(description);
		Fetcher fetcher = new Fetcher();
		Parser parser = new Parser();
		FeedGenerator feedGenerator = null;
		try {
			feedGenerator = new FeedGenerator(parameter, parser.parse(fetcher
					.fetch(parameter)), description);

			resp.setContentType("text/xml; charset=utf-8");
			PrintWriter writer = resp.getWriter();
			StringWriter sw = new StringWriter();
			feedGenerator.generate(sw);
			 System.out.println(sw.toString());
			writer.println(sw.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
