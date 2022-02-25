package com.example.board_eclipse.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 投稿.
 */
@Entity
@Table(name = "post")
@Data
public class Post {

	/** ID */
	@Id
	@Column
	@NotNull
	private String id = null;

	/** 投稿者 */
	@Column(length = 20, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 20)
	private String author = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	/** タイトル */
	@Column(length = 20, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 20)
	private String title = null;

	/** 内容 */
	@Column(length = 1000, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 1000)
	private String body = null;

	/** 登録日時 */
	private Date createdDate = null;

	/** 更新日時 */
	private Date updatedDate = null;

	/** 削除済 */
	private boolean deleted = false;

}

