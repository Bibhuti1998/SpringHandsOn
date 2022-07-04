package com.javaNoobDeveloper.SpringHandsOn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaNoobDeveloper.SpringHandsOn.Service.SaveUserService;
import com.javaNoobDeveloper.SpringHandsOn.entities.User;

@RestController
public class UserController {
	
	@Autowired
	SaveUserService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/Insert")
	public User saveUser() {
		return service.saveUser();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/SaveAll")
	public Iterable<User> saveAllUser() {
		return service.saveAllUser();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/Update")
	public User updateUser() {
		return service.updateUser();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/GetAll")
	public Iterable<User> getAllUser() {
		return service.getAllUser();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/GetUser")
	public User getUser(int id) {
		return service.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/DeleteUser")
	public String deleteUser(int id) {
		return service.deleteUser(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/findByName")
	public List<User> findByName(String name) {
		return service.findByName(name);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getAll/Query")
	public List<User> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getAllByName/Query")
	public List<User> getAllByName(String name) {
		return service.getAllByName(name);
	}

}
