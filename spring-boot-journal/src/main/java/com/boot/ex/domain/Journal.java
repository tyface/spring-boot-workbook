package com.boot.ex.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Journal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private Date created;
	private String summary;

	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("yyyy/dd/MM");

	public Journal(String title, String summary, String created) throws ParseException {
		this.title = title;
		this.created = format.parse(created);
		this.summary = summary;
	}

	public Journal() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCreatedAsShort() {
		return format.format(created);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Journal [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", created=");
		builder.append(created);
		builder.append(", summary=");
		builder.append(summary);
		builder.append(", format=");
		builder.append(format);
		builder.append("]");
		return builder.toString();
	}

}
