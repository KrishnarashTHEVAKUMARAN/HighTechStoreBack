package com.example.HighTechStores.service;

import com.example.HighTechStores.model.TelephoneFixe;
import com.example.HighTechStores.repo.TelephoneFixeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephoneFixeService {
    private final TelephoneFixeRepo telephoneFixeRepo;

    @Autowired
    public TelephoneFixeService(TelephoneFixeRepo telephoneFixeRepo) {
        this.telephoneFixeRepo = telephoneFixeRepo;
    }

    public TelephoneFixe addTelephoneFixe(TelephoneFixe telephoneFixe) {
        return telephoneFixeRepo.save(telephoneFixe);
    }

    public List<TelephoneFixe> getAllTelephoneFixe() {
        return telephoneFixeRepo.findAll();
    }

    public TelephoneFixe updateTelephoneFixe(TelephoneFixe smartphone) {
        return telephoneFixeRepo.save(smartphone);
    }

    public TelephoneFixe findTelephoneFixeById(Long id) {
        return telephoneFixeRepo.findTelephoneFixeById(id)
                .orElseThrow(() -> new RuntimeException("Smartphone not found"));
    }

    public void deleteTelephoneFixe(Long id) {
        telephoneFixeRepo.deleteTelephoneFixeById(id);
    }
}
