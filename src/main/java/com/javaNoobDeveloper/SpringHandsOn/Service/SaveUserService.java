package com.javaNoobDeveloper.SpringHandsOn.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaNoobDeveloper.SpringHandsOn.dao.UserRepository;
import com.javaNoobDeveloper.SpringHandsOn.entities.User;

@Service
public class SaveUserService {
	
	@Autowired
	UserRepository repo;
	//Insert
	public User saveUser() {
		User user = new User();
		user.setName("Bibhuti");
		user.setCity("Cuttack");
		user.setStatus("passed");
		User user1 = repo.save(user);
		return user1;
		
	}
	
    //Insert in bulk
	public Iterable<User> saveAllUser() {
		User user = new User();
		user.setName("Bibhu");
		user.setCity("Cuttack");
		user.setStatus("passed");
		
		User user1 = new User();
		user1.setName("demo");
		user1.setCity("Cuttack");
		user1.setStatus("passed");
		
		User user2 = new User();
		user2.setName("demo1");
		user2.setCity("Cuttack");
		user2.setStatus("passed");
		
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user1);
		list.add(user2);
		Iterable<User> result = repo.saveAll(list);
		result.forEach(users ->{
			System.out.println(users);
		});
		return result;
		
	}
	
	public Iterable<User> getAllUser() {
		Iterable<User> user = repo.findAll();
		return user;
	}
	
	public User getUser(int id) {
		Optional<User> user = repo.findById(id);
		return user.get();
	}
	
	public User updateUser() {
		Optional<User> result = repo.findById(3);
		User user = result.get();
		user.setStatus("Failed");
		User userRes = repo.save(user);
		return userRes;
	}
	
	public String deleteUser(int id) {
		Optional<User> result = repo.findById(id);
		repo.deleteById(id);;
		return result.get().getName()+" Deleted";
	}
	
	public List<User> findByName(String name) {
		return repo.findByName(name);
	}
	
	public List<User> getAll() {
		return repo.getUserByNative();
	}
	
	public List<User> getAllByName(String name) {
		return repo.getUserByName(name);
	}
	
	

}
