package cz.project.testyoso.repositories;

import cz.project.testyoso.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
    List<User> findAll();
}
