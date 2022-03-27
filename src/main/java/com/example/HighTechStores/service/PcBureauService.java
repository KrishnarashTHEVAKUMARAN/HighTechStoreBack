package com.example.HighTechStores.service;

import com.example.HighTechStores.exception.UserNotFoundException;
import com.example.HighTechStores.model.PcBureau;
import com.example.HighTechStores.model.PcPortable;
import com.example.HighTechStores.repo.PcBureauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcBureauService {
    private PcBureauRepo pcBureauRepo;

    @Autowired
    public PcBureauService(PcBureauRepo pcBureauRepo) {
        this.pcBureauRepo = pcBureauRepo;
    }

    public PcBureau addPcBureau(PcBureau pcBureau) {
        return pcBureauRepo.save(pcBureau);
    }

    public List<PcBureau> findAllPcBureau(){
        return pcBureauRepo.findAll();
    }

    public PcBureau updatePcBureau(PcBureau pcBureau){
        return pcBureauRepo.save(pcBureau);
    }

    public PcBureau findPcBureauById(Long id){
        return pcBureauRepo.findPcBureauById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deletePcBureau(Long id){
        pcBureauRepo.deletePcBureauById(id);
    }
}
