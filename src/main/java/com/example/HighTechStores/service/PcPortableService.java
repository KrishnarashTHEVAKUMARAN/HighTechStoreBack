package com.example.HighTechStores.service;

import com.example.HighTechStores.exception.UserNotFoundException;
import com.example.HighTechStores.model.PcPortable;
import com.example.HighTechStores.repo.PcPortableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcPortableService {
    private final PcPortableRepo pcPortableRepo;

    @Autowired
    public PcPortableService(PcPortableRepo pcPortableRepo) {
        this.pcPortableRepo = pcPortableRepo;
    }

    public PcPortable addPcPortable(PcPortable pcPortable) {
        return pcPortableRepo.save(pcPortable);
    }

    public List<PcPortable> findAllPcPortable(){
        return pcPortableRepo.findAll();
    }

    public PcPortable updatePcPortable(PcPortable pcPortable){
        return pcPortableRepo.save(pcPortable);
    }

    public PcPortable findPcPortableById(Long id){
        return pcPortableRepo.findPcPortableById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deletePcPortable(Long id){
        pcPortableRepo.deletePcPortableById(id);
    }

}
