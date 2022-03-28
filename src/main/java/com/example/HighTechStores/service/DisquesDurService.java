package com.example.HighTechStores.service;

import com.example.HighTechStores.exception.UserNotFoundException;
import com.example.HighTechStores.model.DisquesDur;
import com.example.HighTechStores.repo.DisquesDurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisquesDurService {
    private final DisquesDurRepo disquesDurRepo;

    @Autowired
    public DisquesDurService(DisquesDurRepo disquesDurRepo) {
        this.disquesDurRepo = disquesDurRepo;
    }

    public DisquesDur addDisquesDur(DisquesDur users){
        return disquesDurRepo.save(users);
    }

    public List<DisquesDur> findAllDisquesDur(){
        return disquesDurRepo.findAll();
    }

    public DisquesDur updateDisquesDur(DisquesDur users){
        return disquesDurRepo.save(users);
    }

    public DisquesDur findDisquesDurById(Long id){
        return disquesDurRepo.findDisquesDurById(id)
                .orElseThrow(() -> new UserNotFoundException("Disque dur by id " + id + "was not found"));
    }

    public void deleteDisquesDur(Long id){
        disquesDurRepo.deleteDisquesDurById(id);
    }

}
