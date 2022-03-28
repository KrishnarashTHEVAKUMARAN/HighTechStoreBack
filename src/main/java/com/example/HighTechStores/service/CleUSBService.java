package com.example.HighTechStores.service;

import com.example.HighTechStores.exception.UserNotFoundException;
import com.example.HighTechStores.model.CleUSB;
import com.example.HighTechStores.repo.CleUSBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CleUSBService {
    private final CleUSBRepo cleUSBRepo;

    @Autowired
    public CleUSBService(CleUSBRepo cleUSBRepo) {
        this.cleUSBRepo = cleUSBRepo;
    }

    public CleUSB addCleUSB(CleUSB users){
        return cleUSBRepo.save(users);
    }

    public List<CleUSB> findAllCleUSB(){
        return cleUSBRepo.findAll();
    }

    public CleUSB updateCleUSB(CleUSB users){
        return cleUSBRepo.save(users);
    }

    public CleUSB findCleUSBById(Long id){
        return cleUSBRepo.findCleUSBById(id)
                .orElseThrow(() -> new UserNotFoundException("Cle USB by id " + id + "was not found"));
    }

    public void deleteCleUSB(Long id){
        cleUSBRepo.deleteCleUSBById(id);
    }

}
