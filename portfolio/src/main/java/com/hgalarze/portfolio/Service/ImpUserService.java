package com.hgalarze.portfolio.Service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.User;
import com.hgalarze.portfolio.Interface.IUserService;
import com.hgalarze.portfolio.Repository.IUserRepository;

@Service
public class ImpUserService implements IUserService {

    @Autowired
    IUserRepository iUserRepository;

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
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        String userOfChange = "Admin";

        user.setDeleted(false);
        user.setCreatedBy(userOfChange);
        user.setCreatedOn(currentTimestamp);
        user.setUpdatedBy(userOfChange);
        user.setUpdatedOn(currentTimestamp);

        iUserRepository.save(user);
    }

    @Override
    public void update(Long id, User modifiedUser) {
        User user = this.getById(id);
        String userOfChange = "Admin";
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        user.setUpdatedBy(userOfChange);
        user.setUpdatedOn(currentTimestamp);

        iUserRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = this.getById(id);
        String userOfChange = "Admin";
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        user.setDeleted(true);
        user.setDeletedBy(userOfChange);
        user.setDeletedOn(currentTimestamp);
        user.setUpdatedBy(userOfChange);
        user.setUpdatedOn(currentTimestamp);

        iUserRepository.save(user);
    }

}
