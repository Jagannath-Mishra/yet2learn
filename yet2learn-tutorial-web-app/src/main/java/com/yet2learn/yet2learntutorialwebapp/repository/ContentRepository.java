package com.yet2learn.yet2learntutorialwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yet2learn.yet2learntutorialwebapp.entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

	@Query("from Content c where c.course.id = :id")
	List<Content> findByCourseId(Long id);
}
