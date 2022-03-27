package com.example.HighTechStores.repo;

import com.example.HighTechStores.model.PcBureau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PcBureauRepo extends JpaRepository<PcBureau,Long> {
    void deletePcBureauById(Long id);

    Optional<PcBureau> findPcBureauById(Long id);
}