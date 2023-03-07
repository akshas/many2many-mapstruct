package dev.testprojects.mapstructmapping.mapper;

import dev.testprojects.mapstructmapping.dto.*;
import dev.testprojects.mapstructmapping.entity.Author;
import dev.testprojects.mapstructmapping.entity.Book;
import dev.testprojects.mapstructmapping.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    BookSlimDto bookToSlimDto(Book book);
    BookDto toBookDto (Book book);
    AuthorDto authorToAuthorDto(Author author);

    AuthorAllDto authorToAuthorAllDto(Author author);

    List<AuthorAllDto> authorsToAuthorAllDtos(List<Author> authors);

    UserGetDto userToUserGetDto(User user);

    User userPostDtoToUser(UserPostDto userPostDto);
}
