package dev.testprojects.mapstructmapping.repository;

import dev.testprojects.mapstructmapping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
