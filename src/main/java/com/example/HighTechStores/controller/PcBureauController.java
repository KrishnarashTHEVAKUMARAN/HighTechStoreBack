package com.example.HighTechStores.controller;

import com.example.HighTechStores.model.PcBureau;
import com.example.HighTechStores.model.PcPortable;
import com.example.HighTechStores.service.PcBureauService;
import com.example.HighTechStores.service.PcPortableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pcBureau")
public class PcBureauController {
    private final PcBureauService pcBureauService;

    public PcBureauController(PcBureauService pcBureauService) {
        this.pcBureauService = pcBureauService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PcBureau>> getAllUsers(){
        List<PcBureau> pcBureau = pcBureauService.findAllPcBureau();
        return new ResponseEntity<>(pcBureau, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PcBureau> getUsersById(@PathVariable("id") Long id){
        PcBureau pcBureau = pcBureauService.findPcBureauById(id);
        return new ResponseEntity<>(pcBureau, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PcBureau> addUsers(@RequestBody PcBureau pcBureau){
        PcBureau newPcBureau = pcBureauService.addPcBureau(pcBureau);
        return new ResponseEntity<>(newPcBureau, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PcBureau> updateUsers(@RequestBody PcBureau pcBureau){
        PcBureau updatePcBureau = pcBureauService.updatePcBureau(pcBureau);
        return new ResponseEntity<>(updatePcBureau, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PcBureau> deleteUsers(@PathVariable("id") Long id){
        pcBureauService.deletePcBureau(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
