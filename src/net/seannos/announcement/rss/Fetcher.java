package net.seannos.announcement.rss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.w3c.dom.Document;

public class Fetcher {

	public String fetch(String urlString) {
		try {
			URL url;
			url = new URL(urlString);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream(),"utf8"));
			String line;
			StringBuffer fetchedPage = new StringBuffer();

			while ((line = reader.readLine()) != null) {
				fetchedPage.append(line);
				fetchedPage.append("\n");
			}
			reader.close();
			return fetchedPage.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
