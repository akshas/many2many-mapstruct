package dev.testprojects.mapstructmapping.controller;

import dev.testprojects.mapstructmapping.dto.BookDto;
import dev.testprojects.mapstructmapping.entity.Book;
import dev.testprojects.mapstructmapping.mapper.MapStructMapper;
import dev.testprojects.mapstructmapping.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {
    private MapStructMapper mapStructMapper;
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository, MapStructMapper mapStructMapper) {
        this.mapStructMapper = mapStructMapper;
        this.bookRepository = bookRepository;
    }

    @PostMapping()
    public ResponseEntity<Void> saveBook(@Valid @RequestBody Book book) {
        bookRepository.save(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBooks(@PathVariable long id) {
        return new ResponseEntity<>(
                mapStructMapper.toBookDto(bookRepository.findById(id).get()),
                HttpStatus.OK
        );
    }
}
