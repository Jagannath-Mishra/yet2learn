package com.yet2learn.yet2learntutorialwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yet2learn.yet2learntutorialwebapp.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	//Role findByRole(String string);

}
