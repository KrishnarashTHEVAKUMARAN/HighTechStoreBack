package com.example.HighTechStores.service;

import com.example.HighTechStores.model.Smartphone;
import com.example.HighTechStores.repo.SmartphoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneService {
    private final SmartphoneRepo smartphoneRepo;

    @Autowired
    public SmartphoneService(SmartphoneRepo smartphoneRepo) {
        this.smartphoneRepo = smartphoneRepo;
    }

    public Smartphone addSmartphone(Smartphone smartphone) {
        return smartphoneRepo.save(smartphone);
    }

    public List<Smartphone> getAllSmartphones() {
        return smartphoneRepo.findAll();
    }

    public Smartphone updateSmartphone(Smartphone smartphone) {
        return smartphoneRepo.save(smartphone);
    }

    public Smartphone findSmartphoneById(Long id) {
        return smartphoneRepo.findSmartphoneById(id)
                .orElseThrow(() -> new RuntimeException("Smartphone not found"));
    }

    public void deleteSmartphone(Long id) {
        smartphoneRepo.deleteSmartphoneById(id);
    }
}
