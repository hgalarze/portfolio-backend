package com.hgalarze.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgalarze.portfolio.Entity.Project;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Long> {

}
