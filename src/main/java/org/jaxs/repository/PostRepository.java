package org.jaxs.repository;

import org.jaxs.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer>{
	
}
