package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.Education;
import com.hgalarze.portfolio.Interface.IEducationService;

@Service
public class ImpEducationService implements IEducationService {

    @Override
    public List<Education> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Education getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Education getByProfileId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Education profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void edit(Long id, Education profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
