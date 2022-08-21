package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.Experience;

public interface IExperienceService {

    public List<Experience> getAll();

    public Experience getById(Long id);

    public Experience getByProfileId(Long id);

    public void create(Experience profile);

    public void edit(Long id, Experience profile);

    public void delete(Long id);
}
