package dev.testprojects.mapstructmapping.controller;

import dev.testprojects.mapstructmapping.dto.AuthorAllDto;
import dev.testprojects.mapstructmapping.dto.AuthorDto;
import dev.testprojects.mapstructmapping.entity.Author;
import dev.testprojects.mapstructmapping.mapper.MapStructMapper;
import dev.testprojects.mapstructmapping.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private MapStructMapper mapStructMapper;
    private AuthorRepository authorRepository;

    @Autowired
    public AuthorController(MapStructMapper mapStructMapper, AuthorRepository authorRepository) {
        this.mapStructMapper = mapStructMapper;
        this.authorRepository = authorRepository;
    }

    @PostMapping()
    public ResponseEntity<Void> create(@Valid @RequestBody Author author) {
        authorRepository.save(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorAllDto> getAuthor(@PathVariable long id) {
        return new ResponseEntity<>(
                mapStructMapper.authorToAuthorAllDto(authorRepository.findById(id).get()),
                HttpStatus.OK
        );
    }
}
