package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.Education;

public interface IEducationService {

    public List<Education> getAll();

    public Education getById(Long id);

    public Education getByProfileId(Long id);

    public void create(Education profile);

    public void edit(Long id, Education profile);

    public void delete(Long id);
}
