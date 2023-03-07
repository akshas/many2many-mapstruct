package dev.testprojects.mapstructmapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @Column(name="author_id")
    private long authorId;
    private String name;
    private String surname;
    @Column(name="birth_date")
    private Date birthDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="book_author", joinColumns = @JoinColumn(name="author_id"), inverseJoinColumns = @JoinColumn(name="book_id"))
    Set<Book> books = new HashSet<>();
}
