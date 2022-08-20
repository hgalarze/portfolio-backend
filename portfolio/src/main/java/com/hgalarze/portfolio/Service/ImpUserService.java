package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.User;
import com.hgalarze.portfolio.Interface.IUserService;
import com.hgalarze.portfolio.Repository.IUserRepository;

@Service
public class ImpUserService implements IUserService {

    @Autowired IUserRepository iUserRepository;

    @Override
    public List<User> getAll() {
        List<User> users = iUserRepository.findAll();
        return users;
    }

    @Override
    public User getById(Long id) {
        User user = iUserRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void update(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        iUserRepository.deleteById(id);
    }
    
}
