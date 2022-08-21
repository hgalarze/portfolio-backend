package com.hgalarze.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgalarze.portfolio.Entity.Skill;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long> {

}
