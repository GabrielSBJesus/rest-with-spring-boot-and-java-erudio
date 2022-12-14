package br.com.erudio;

public class Greeding {
	private final long id;
	private final String content;
	private final String indicator;
	
	public Greeding(long id, String content, String indicator) {
		this.id = id;
		this.content = content;
		this.indicator = indicator;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public String getIndicator() {
		return indicator;
	}
	
	
	
}
