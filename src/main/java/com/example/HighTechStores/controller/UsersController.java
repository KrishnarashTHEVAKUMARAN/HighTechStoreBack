package com.example.HighTechStores.controller;

import com.example.HighTechStores.model.Users;
import com.example.HighTechStores.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable("id") Long id){
        Users users = usersService.findUsersById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Users> addUsers(@RequestBody Users users){
        Users newUsers = usersService.addUsers(users);
        return new ResponseEntity<>(newUsers, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Users> updateUsers(@RequestBody Users users){
        Users updateUsers = usersService.updateUsers(users);
        return new ResponseEntity<>(updateUsers, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteUsers(@PathVariable("id") Long id){
        usersService.deleteUsers(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
