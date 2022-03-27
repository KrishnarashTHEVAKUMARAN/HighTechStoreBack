package com.example.HighTechStores.repo;


import com.example.HighTechStores.model.PcPortable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PcPortableRepo extends JpaRepository<PcPortable,Long> {
    void deletePcPortableById(Long id);

    Optional<PcPortable> findPcPortableById(Long id);
}
