package com.example.HighTechStores.repo;

import com.example.HighTechStores.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SmartphoneRepo extends JpaRepository<Smartphone, Long> {
    void deleteSmartphoneById(Long id);

    Optional<Smartphone> findSmartphoneById(Long id);
}
