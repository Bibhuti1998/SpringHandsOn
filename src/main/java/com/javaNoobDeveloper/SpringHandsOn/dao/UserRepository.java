package com.javaNoobDeveloper.SpringHandsOn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javaNoobDeveloper.SpringHandsOn.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	//You don't have to write implementation
	public List<User> findByName(String name);
	//find -- introducer   ByName -- Criteria
	
	//Custom query fired using @query annotation
	@Query ("SELECT u from User u")
	public List<User> getAllUser();
	
	@Query("SELECT u FROM User u WHERE u.name = :n")
	public List<User> getUserByName(@Param("n")String name);
	
	//Native query fire
	@Query(value = "SELECT * FROM public.\"user\"", nativeQuery = true)
	public List<User> getUserByNative();
}
