package org.jaxs.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.jaxs.entity.Post;
import org.jaxs.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
	
	@Autowired
	private PostRepository repo;
	
	
	
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		System.out.println("Top the array");
		System.out.println(repo.findAll());
		for(Post post: repo.findAll()) {
			System.out.println("inside the array");
			list.add(post);
		}
		System.out.println("bottom the array");
		return list;
		
	}

	public Post getPost(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void addPost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
	}

	public void updatePost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
	}
	
	public void deletePost(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}

