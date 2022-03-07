package com.yet2learn.yet2learntutorialwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yet2learn.yet2learntutorialwebapp.entity.SubContent;

@Repository
public interface SubContentRepository extends JpaRepository<SubContent, Long> {

	@Query("Select s from SubContent s where s.subContentMetaURL =:url")
	SubContent findBySubContentMetaURL(String url);

}
