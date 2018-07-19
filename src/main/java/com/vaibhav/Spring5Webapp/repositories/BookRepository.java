package com.vaibhav.Spring5Webapp.repositories;

import com.vaibhav.Spring5Webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vaibh on 7/19/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
