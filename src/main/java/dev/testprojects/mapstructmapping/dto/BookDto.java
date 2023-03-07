package dev.testprojects.mapstructmapping.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class BookDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("releasDate")
    private Date releaseDate;
    @JsonProperty("authors")
    private Set<AuthorDto> authors;
}
