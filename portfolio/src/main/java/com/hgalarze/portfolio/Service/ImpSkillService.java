package com.hgalarze.portfolio.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hgalarze.portfolio.Entity.Skill;
import com.hgalarze.portfolio.Interface.ISkillService;

@Service
public class ImpSkillService implements ISkillService {

    @Override
    public List<Skill> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Skill getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Skill getByProfileId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Skill profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void edit(Long id, Skill profile) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

}
