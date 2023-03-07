package dev.testprojects.mapstructmapping.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserPostDto {
    @JsonProperty("id")
    private long id;
    @NotNull
    @JsonProperty("email")
    private String email;
    @NotNull
    @JsonProperty("password")
    private String password;
    @JsonProperty("name")
    private String name;

}
