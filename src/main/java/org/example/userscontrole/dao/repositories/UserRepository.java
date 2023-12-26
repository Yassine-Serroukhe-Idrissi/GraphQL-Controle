package org.example.userscontrole.dao.repositories;

import org.example.userscontrole.dao.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByEmail(String email);
    public List<User> findUserByDateNaissance(String dateNaissance);
}
