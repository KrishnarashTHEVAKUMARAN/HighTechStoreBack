package com.example.HighTechStores.repo;

import com.example.HighTechStores.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users,Long> {
    void deleteUsersById(Long id);

    Optional<Users> findUsersById(Long id);

    Optional<Users> findUsersByEmail(String email);
}
