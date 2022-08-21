package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.Profile;
import com.hgalarze.portfolio.Interface.IProfileService;

@Service
public class ImpPorfileService implements IProfileService {

    @Override
    public List<Profile> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Profile getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Profile profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void edit(Long id, Profile profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
