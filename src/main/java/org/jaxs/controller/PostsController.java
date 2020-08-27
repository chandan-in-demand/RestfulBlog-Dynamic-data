package org.jaxs.controller;

import java.util.List;

import org.jaxs.entity.Post;
import org.jaxs.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
	
	@Autowired
	private PostsService service;
	
	@RequestMapping("/posts")
	public List<Post> getPosts(){
		return service.getPosts();
	}

	
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {
		return service.getPost(id);

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/post")
	public void addPost(@RequestBody Post listElement) {
		service.addPost(listElement);	
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/post/{id}")
	public void updatePost(@RequestBody Post post) {
		service.updatePost(post);
	}
	
	@DeleteMapping(value = "/post/{id}")
	public void deletePost(@PathVariable int id) {
		service.deletePost(id);
	}		
}
