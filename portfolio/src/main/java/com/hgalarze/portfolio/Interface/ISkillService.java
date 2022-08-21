package com.hgalarze.portfolio.Interface;

import java.util.List;

import com.hgalarze.portfolio.Entity.Skill;

public interface ISkillService {

    public List<Skill> getAll();

    public Skill getById(Long id);

    public Skill getByProfileId(Long id);

    public void create(Skill profile);

    public void edit(Long id, Skill profile);

    public void delete(Long id);
}
