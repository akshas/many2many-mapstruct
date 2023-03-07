package dev.testprojects.mapstructmapping.repository;

import dev.testprojects.mapstructmapping.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
