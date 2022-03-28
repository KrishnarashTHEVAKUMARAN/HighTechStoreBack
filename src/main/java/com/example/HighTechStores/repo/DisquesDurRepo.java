package com.example.HighTechStores.repo;

import com.example.HighTechStores.model.DisquesDur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisquesDurRepo extends JpaRepository<DisquesDur,Long> {
    void deleteDisquesDurById(Long id);

    Optional<DisquesDur> findDisquesDurById(Long id);
}
