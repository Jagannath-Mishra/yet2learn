package com.yet2learn.yet2learntutorialwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yet2learn.yet2learntutorialwebapp.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
