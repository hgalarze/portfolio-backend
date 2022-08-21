package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.Project;
import com.hgalarze.portfolio.Interface.IProjectService;

@Service
public class ImpProjectService implements IProjectService {

    @Override
    public List<Project> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Project getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Project getByProfileId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Project profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void edit(Long id, Project profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
