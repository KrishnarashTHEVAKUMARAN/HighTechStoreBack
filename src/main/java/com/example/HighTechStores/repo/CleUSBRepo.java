package com.example.HighTechStores.repo;


import com.example.HighTechStores.model.CleUSB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CleUSBRepo extends JpaRepository<CleUSB,Long> {
    void deleteCleUSBById(Long id);

    Optional<CleUSB> findCleUSBById(Long id);
}
