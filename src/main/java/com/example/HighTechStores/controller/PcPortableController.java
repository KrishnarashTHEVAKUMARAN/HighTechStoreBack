package com.example.HighTechStores.controller;

import com.example.HighTechStores.model.PcPortable;
import com.example.HighTechStores.service.PcPortableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pcPortable")
public class PcPortableController {

    private final PcPortableService pcPortableService;

    public PcPortableController(PcPortableService pcPortableService) {
        this.pcPortableService = pcPortableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PcPortable>> getAllUsers(){
        List<PcPortable> pcPortables = pcPortableService.findAllPcPortable();
        return new ResponseEntity<>(pcPortables, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PcPortable> getUsersById(@PathVariable("id") Long id){
        PcPortable pcPortables = pcPortableService.findPcPortableById(id);
        return new ResponseEntity<>(pcPortables, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<PcPortable> addUsers(@RequestBody PcPortable users){
        PcPortable newPcPortables = pcPortableService.addPcPortable(users);
        return new ResponseEntity<>(newPcPortables, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PcPortable> updateUsers(@RequestBody PcPortable users){
        PcPortable updatePcPortables = pcPortableService.updatePcPortable(users);
        return new ResponseEntity<>(updatePcPortables, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PcPortable> deleteUsers(@PathVariable("id") Long id){
        pcPortableService.deletePcPortable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
