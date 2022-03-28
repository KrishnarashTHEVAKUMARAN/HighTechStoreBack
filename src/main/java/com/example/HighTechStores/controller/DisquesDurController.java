package com.example.HighTechStores.controller;

import com.example.HighTechStores.model.DisquesDur;
import com.example.HighTechStores.service.DisquesDurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/disquesDur")
public class DisquesDurController {
    private final DisquesDurService disquesDurService;

    public DisquesDurController(DisquesDurService disquesDurService) {
        this.disquesDurService = disquesDurService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<DisquesDur>> getAllDisquesDur(){
        List<DisquesDur> disquesDur = disquesDurService.findAllDisquesDur();
        return new ResponseEntity<>(disquesDur, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<DisquesDur> getDisquesDurById(@PathVariable("id") Long id){
        DisquesDur disquesDur = disquesDurService.findDisquesDurById(id);
        return new ResponseEntity<>(disquesDur, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<DisquesDur> addDisquesDur(@RequestBody DisquesDur DisquesDur){
        DisquesDur newDisquesDur = disquesDurService.addDisquesDur(DisquesDur);
        return new ResponseEntity<>(newDisquesDur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<DisquesDur> updateDisquesDur(@RequestBody DisquesDur DisquesDur){
        DisquesDur updateDisquesDur = disquesDurService.updateDisquesDur(DisquesDur);
        return new ResponseEntity<>(updateDisquesDur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DisquesDur> deleteDisquesDur(@PathVariable("id") Long id){
        disquesDurService.deleteDisquesDur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
