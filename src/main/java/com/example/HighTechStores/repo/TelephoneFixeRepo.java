package com.example.HighTechStores.repo;

import com.example.HighTechStores.model.TelephoneFixe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TelephoneFixeRepo extends JpaRepository<TelephoneFixe, Long> {
    void deleteTelephoneFixeById(Long id);

    Optional<TelephoneFixe> findTelephoneFixeById(Long id);
}
