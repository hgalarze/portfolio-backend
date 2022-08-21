package com.hgalarze.portfolio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.hgalarze.portfolio.Entity.User;
import com.hgalarze.portfolio.Interface.IUserService;

@RestController
public class UserController {
    @Autowired
    IUserService iUserService;

    @GetMapping("users/getAll")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> getAll() {
        try {
            List<User> users = iUserService.getAll();
            return users;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to process the request");
        }
    }

    @GetMapping("users/getById/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public User getById(@PathVariable Long id) {
        try {
            User user = iUserService.getById(id);
            if (user == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
            }
            return user;
        } catch (ResponseStatusException rse) {
            throw rse;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to process the request");
        }
    }

    @PostMapping("users/create")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "User created succesfully")
    public void create(@RequestBody User user) {
        try {
            iUserService.create(user);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to process the request");
        }
    }

    @PatchMapping("users/edit/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "User updated succesfully")
    public void update(@PathVariable Long id, @RequestBody User modifiedUser) {
        try {
            iUserService.update(id, modifiedUser);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to process the request");
        }
    }

    @DeleteMapping("users/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "User deleted succesfully")
    public void delete(@PathVariable Long id) {
        try {
            iUserService.delete(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to process the request");
        }
    }
}
