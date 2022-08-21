package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.Project;

public interface IProjectService {

    public List<Project> getAll();

    public Project getById(Long id);

    public Project getByProfileId(Long id);

    public void create(Project profile);

    public void edit(Long id, Project profile);

    public void delete(Long id);
}
