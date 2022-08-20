package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.User;

public interface IUserService {
    
    public List<User> getAll();
    public User getById(Long id);
    public void create(User user);
    public void update(User user);
    public void delete(Long id);
}
