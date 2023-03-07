package dev.testprojects.mapstructmapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name="customer_id")
    private long customerId;
    private String name;
    private String surname;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_book", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="book_id"))
    Set<Book> books = new HashSet<>();
}
