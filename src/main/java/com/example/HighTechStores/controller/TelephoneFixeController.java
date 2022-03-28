package com.example.HighTechStores.controller;

import com.example.HighTechStores.model.TelephoneFixe;
import com.example.HighTechStores.service.TelephoneFixeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/telephoneFixe")
public class TelephoneFixeController {
    private final TelephoneFixeService telephoneFixeService;

    public TelephoneFixeController(TelephoneFixeService telephoneFixeService) {
        this.telephoneFixeService = telephoneFixeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TelephoneFixe>> getAllTelephoneFixes() {
        List<TelephoneFixe> TelephoneFixes = telephoneFixeService.getAllTelephoneFixe();
        return new ResponseEntity<>(TelephoneFixes, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<TelephoneFixe> getTelephoneFixeById(@PathVariable("id") Long id){
        TelephoneFixe TelephoneFixes = telephoneFixeService.findTelephoneFixeById(id);
        return new ResponseEntity<>(TelephoneFixes, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<TelephoneFixe> addTelephoneFixe(@RequestBody TelephoneFixe TelephoneFixes){
        TelephoneFixe newTelephoneFixe = telephoneFixeService.addTelephoneFixe(TelephoneFixes);
        return new ResponseEntity<>(newTelephoneFixe, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<TelephoneFixe> updateTelephoneFixe(@RequestBody TelephoneFixe TelephoneFixe){
        TelephoneFixe updateTelephoneFixe = telephoneFixeService.updateTelephoneFixe(TelephoneFixe);
        return new ResponseEntity<>(updateTelephoneFixe, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<TelephoneFixe> deleteTelephoneFixe(@PathVariable("id") Long id){
        telephoneFixeService.deleteTelephoneFixe(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
