package com.apress.spring.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JournalEntry {
	private String title;
	private Date created;
	private String summary;
	
	private final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");


	public JournalEntry(String title, String summary, String created) throws ParseException {
		this.title = title;
		this.summary = summary;
		this.created = format.parse(created);
	}
	
	public JournalEntry(){
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(String date) throws ParseException{
		Long _date = null;
		try {
			_date = Long.parseLong(date);
			this.created = new Date(_date);
			return;
		} catch(Exception ex) {}
		this.created = format.parse(date);
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JournalEntry [title=");
		builder.append(title);
		builder.append(", summary=");
		builder.append(summary);
		builder.append(", created=");
		builder.append(format.format(created));
		builder.append("]");
		return builder.toString();
	}

	
}
