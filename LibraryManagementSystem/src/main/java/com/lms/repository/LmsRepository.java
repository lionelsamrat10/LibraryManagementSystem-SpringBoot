package com.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Book;

@Repository
public interface LmsRepository extends CrudRepository<Book, Long>{
	
}
