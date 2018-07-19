package com.vaibhav.Spring5Webapp.Bootstrap;

import com.vaibhav.Spring5Webapp.model.Author;
import com.vaibhav.Spring5Webapp.model.Book;
import com.vaibhav.Spring5Webapp.model.Publisher;
import com.vaibhav.Spring5Webapp.repositories.AuthorRepository;
import com.vaibhav.Spring5Webapp.repositories.BookRepository;
import com.vaibhav.Spring5Webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by vaibh on 7/19/2018.
 */
@Component
public class devBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public devBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        initData();
    }



    private void initData(){

        Publisher publisher = new Publisher("test", "NYC");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Ebans");
        //Publisher pubs = new Publisher("penguim", "NYC");
        Book ddd = new Book("java", "dfdfdf", publisher);
        eric.getBookSet().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author Ivan = new Author("Ivan", "Er");
        Publisher pubs = new Publisher("peguim", "NYCp");
        Book rrr = new Book("j2EE", "sdfdfsd", publisher);
        Ivan.getBookSet().add(rrr);
        rrr.getAuthors().add(Ivan);

        authorRepository.save(Ivan);
        bookRepository.save(rrr);
    }
}
