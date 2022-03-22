package com.example.HighTechStores.service;

import com.example.HighTechStores.exception.UserNotFoundException;
import com.example.HighTechStores.model.Users;
import com.example.HighTechStores.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepo usersRepo;

    @Autowired
    public UsersService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public Users addUsers(Users users){
        return usersRepo.save(users);
    }

    public List<Users> findAllUsers(){
        return usersRepo.findAll();
    }

    public Users updateUsers(Users users){
        return usersRepo.save(users);
    }

    public Users findUsersById(Long id){
        return usersRepo.findUsersById(id)
                .orElseThrow(() -> new UserNotFoundException("Users by id " + id + "was not found"));
    }

    public void deleteUsers(Long id){
        usersRepo.deleteUsersById(id);
    }

}
