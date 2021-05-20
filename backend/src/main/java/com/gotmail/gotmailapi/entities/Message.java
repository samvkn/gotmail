package com.gotmail.gotmailapi.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "messages")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 80)
	private String subject;
	
	@Column(nullable = false)
	private String message;
	
	@Column(nullable = false)
	private String receiver;
	
	@Column(columnDefinition = "datetime DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime date;
	
	@Column(columnDefinition = "tinyint(1) DEFAULT 0")
	private Boolean read;
	
	@ManyToOne
	@JoinColumn(name = "sender_id")
	private User user;

	public Message() {

	}

	public Message(Long id, String subject, String message, String receiver, LocalDateTime date, Boolean read,
			User user) {
		this.id = id;
		this.subject = subject;
		this.message = message;
		this.receiver = receiver;
		this.date = date;
		this.read = read;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Boolean getRead() {
		return read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}