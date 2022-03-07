package com.yet2learn.yet2learntutorialwebapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.yet2learn.yet2learntutorialwebapp.config.Auditable;

@Entity
@Table(name = "course_sub_contents")
public class SubContent extends Auditable<String> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8868366542490969518L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "varchar(55)")
	private String subContentHeading;

	@Length(min = 5, max = 20, message = "*Your user name must have at least 5 characters and max 20 characters")
	@NotEmpty(message = "*Please provide a SubContentSortName")
	private String subContentSortName;

	private Long nextPageId;

	private Long prevPageId;

	private String subContentBody;
	
	private String subContentMetaURL;

	private Integer hits;
	
	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean enable;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "content_id", referencedColumnName = "id", nullable = false)
	private Content content;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubContentHeading() {
		return subContentHeading;
	}

	public void setSubContentHeading(String subContentHeading) {
		this.subContentHeading = subContentHeading;
	}

	public String getSubContentSortName() {
		return subContentSortName;
	}

	public void setSubContentSortName(String subContentSortName) {
		this.subContentSortName = subContentSortName;
	}

	public Long getNextPageId() {
		return nextPageId;
	}

	public void setNextPageId(Long nextPageId) {
		this.nextPageId = nextPageId;
	}

	public Long getPrevPageId() {
		return prevPageId;
	}

	public void setPrevPageId(Long prevPageId) {
		this.prevPageId = prevPageId;
	}

	public String getSubContentBody() {
		return subContentBody;
	}

	public void setSubContentBody(String subContentBody) {
		this.subContentBody = subContentBody;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getSubContentMetaURL() {
		return subContentMetaURL;
	}

	public void setSubContentMetaURL(String subContentMetaURL) {
		this.subContentMetaURL = subContentMetaURL;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}


	
}

