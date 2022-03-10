package spring2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring2.model.BooksA;
import spring2.service.BooksAService;

import java.util.List;

@RestController
@RequestMapping("books") // ?
public class BooksAController {

    BooksAService bookService;

    @Autowired
    public BooksAController(BooksAService bookService){this.bookService = bookService;}

    @GetMapping
    public List<BooksA> getBooks(){return bookService.findAllBooks();}

    @GetMapping("title/{title}")
    public BooksA getBookByTitle(@PathVariable String title){return bookService.getBookByTitle(title);}

    @PostMapping
    public BooksA postBook(@RequestBody BooksA book){return bookService.saveBook(book);}

    //@PatchMapping


    @DeleteMapping
    public void deleteBook(@RequestBody BooksA book){bookService.deleteBook(book);}

}
