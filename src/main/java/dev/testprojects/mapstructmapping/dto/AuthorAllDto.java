package dev.testprojects.mapstructmapping.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.testprojects.mapstructmapping.entity.Book;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class AuthorAllDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("email")
    private String email;
    @JsonProperty("birthDate")
    private Date birthDate;
    @JsonProperty("books")
    private Set<BookSlimDto> books;
}
