package com.yet2learn.yet2learntutorialwebapp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.yet2learn.yet2learntutorialwebapp.config.Auditable;

@Entity
@Table(name = "course_contents")
public class Content extends Auditable<User> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8868366542490969518L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "varchar(55)")
	private String contentHeading;

	private Integer hits;

	@Column(columnDefinition = "tinyint(1) default 1")
	private boolean enable;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false)
	private Course course;

	@OneToMany(mappedBy = "content", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SubContent> subContent = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContentHeading() {
		return contentHeading;
	}

	public void setContentHeading(String contentHeading) {
		this.contentHeading = contentHeading;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<SubContent> getSubContent() {
		return subContent;
	}

	public void setSubContent(Set<SubContent> subContent) {
		this.subContent = (List<SubContent>) subContent;
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", contentHeading=" + contentHeading + ", hits=" + hits + ", enable=" + enable
				+ ", course=" + course + ", subContent=" + subContent + "]";
	}

}
