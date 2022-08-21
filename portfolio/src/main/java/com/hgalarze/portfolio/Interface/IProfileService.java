package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.Profile;

public interface IProfileService {

    public List<Profile> getAll();

    public Profile getById(Long id);

    public void create(Profile profile);

    public void edit(Long id, Profile profile);

    public void delete(Long id);
}
