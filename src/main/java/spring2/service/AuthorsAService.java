package spring2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring2.model.AuthorsA;
import spring2.repository.AuthorsARepository;

import java.lang.annotation.*;
import java.util.List;

@Component
public class AuthorsAService {

    AuthorsARepository authorRepository;

    public AuthorsAService(AuthorsARepository authorRepository){this.authorRepository = authorRepository;}

    public List<AuthorsA> findAllAuthors(){return authorRepository.findAll();}

    public AuthorsA getAuthorByName(String name){return authorRepository.findByName(name);}

    public AuthorsA saveAuthor(AuthorsA author){return authorRepository.save(author);}

    //update/patch method

    public void deleteAuthor(AuthorsA author){authorRepository.myDelete(author.getName());}
}
