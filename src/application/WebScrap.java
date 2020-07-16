package application;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrap {
	private String Url;
	private String HTMLClass;

	public WebScrap(String url, String htmlclass) {
		this.Url = url;
		this.HTMLClass = htmlclass;
	}

	public String Scrap() throws IOException {
		Document document = Jsoup.connect(this.Url).get();

		for (Element row : document.select(this.HTMLClass)) {
			return row.text();
		}
		return "";
	}
}
