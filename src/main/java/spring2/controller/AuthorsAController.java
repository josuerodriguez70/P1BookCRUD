package spring2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring2.model.AuthorsA;
import spring2.service.AuthorsAService;

import java.util.List;

@RestController
@RequestMapping("authors") // ?
public class AuthorsAController {

    AuthorsAService authorService;

    @Autowired
    public AuthorsAController(AuthorsAService authorService){this.authorService = authorService;}

    @GetMapping
    List<AuthorsA> getAuthors(){return authorService.findAllAuthors();}

    @GetMapping("name/{name}")
    public AuthorsA getAuthorByName(@PathVariable String name) {return authorService.getAuthorByName(name);}

    @PostMapping()
    public AuthorsA postAuthors(@RequestBody AuthorsA author){return authorService.saveAuthor(author);}

    //@PatchMapping

    @DeleteMapping
    public void deleteAuthor(@RequestBody AuthorsA author){authorService.deleteAuthor(author);}
}
