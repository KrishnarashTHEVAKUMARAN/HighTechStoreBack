package com.example.HighTechStores.controller;


import com.example.HighTechStores.model.CleUSB;
import com.example.HighTechStores.service.CleUSBService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cleUsb")
public class CleUSBController {
    private final CleUSBService cleUSBService;

    public CleUSBController(CleUSBService cleUSBService) {
        this.cleUSBService = cleUSBService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CleUSB>> getAllCleUSB(){
        List<CleUSB> cleUSB = cleUSBService.findAllCleUSB();
        return new ResponseEntity<>(cleUSB, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CleUSB> getCleUSBById(@PathVariable("id") Long id){
        CleUSB cleUSB = cleUSBService.findCleUSBById(id);
        return new ResponseEntity<>(cleUSB, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CleUSB> addCleUSB(@RequestBody CleUSB cleUSB){
        CleUSB newCleUSB = cleUSBService.addCleUSB(cleUSB);
        return new ResponseEntity<>(newCleUSB, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CleUSB> updateCleUSB(@RequestBody CleUSB cleUSB){
        CleUSB updateCleUSB = cleUSBService.updateCleUSB(cleUSB);
        return new ResponseEntity<>(updateCleUSB, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CleUSB> deleteCleUSB(@PathVariable("id") Long id){
        cleUSBService.deleteCleUSB(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
