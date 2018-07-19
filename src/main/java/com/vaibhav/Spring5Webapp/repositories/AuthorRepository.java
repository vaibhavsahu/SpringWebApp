package com.vaibhav.Spring5Webapp.repositories;

import com.vaibhav.Spring5Webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vaibh on 7/18/2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
