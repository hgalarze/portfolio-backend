package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.Experience;
import com.hgalarze.portfolio.Interface.IExperienceService;

@Service
public class ImpExperienceService implements IExperienceService {

    @Override
    public List<Experience> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Experience getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Experience getByProfileId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Experience profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void edit(Long id, Experience profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
