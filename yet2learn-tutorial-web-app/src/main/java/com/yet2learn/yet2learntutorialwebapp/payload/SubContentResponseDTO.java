package com.yet2learn.yet2learntutorialwebapp.payload;

import java.util.Date;

import com.yet2learn.yet2learntutorialwebapp.entity.Content;

public class SubContentResponseDTO {

	private Long id;

	private String subContentHeading;

	private String subContentSortName;

	private Long nextPageId;

	private Long prevPageId;

	private String subContentBody;

	private String subContentMetaURL;

	private Integer hits;

	private boolean enable;

	private Content content;

	private Date lastModifiedDate;

	private String lastModifiedBy;

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

	public String getSubContentMetaURL() {
		return subContentMetaURL;
	}

	public void setSubContentMetaURL(String subContentMetaURL) {
		this.subContentMetaURL = subContentMetaURL;
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

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

}
