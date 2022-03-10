package spring2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring2.model.BooksA;
import spring2.repository.BooksARepository;

import java.lang.annotation.*;
import java.util.List;

@Component
public class BooksAService {

    BooksARepository bookRepository;

    public BooksAService(BooksARepository bookRepository){this.bookRepository = bookRepository;}

    public List<BooksA> findAllBooks(){return bookRepository.findAll();}

    public BooksA getBookByTitle(String title){return bookRepository.findByTitle(title);}

    public BooksA saveBook(BooksA book){return bookRepository.save(book);}

    //update/patch method


    public void deleteBook(BooksA book){bookRepository.myDelete(book.getTitle());}

}
