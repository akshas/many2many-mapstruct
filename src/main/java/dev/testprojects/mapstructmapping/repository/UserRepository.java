package dev.testprojects.mapstructmapping.repository;


import dev.testprojects.mapstructmapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
