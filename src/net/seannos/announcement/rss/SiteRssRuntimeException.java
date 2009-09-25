package net.seannos.announcement.rss;

public class SiteRssRuntimeException extends RuntimeException {
	private final Exception e;

	public SiteRssRuntimeException() {
		e = null;
	}

	public SiteRssRuntimeException(Exception e) {
		this.e = e;
	}

	public Exception getException() {
		return e;
	}
}
