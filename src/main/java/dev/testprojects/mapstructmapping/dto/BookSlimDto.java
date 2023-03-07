package dev.testprojects.mapstructmapping.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSlimDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private long title;
}
