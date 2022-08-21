package com.hgalarze.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgalarze.portfolio.Entity.Education;

@Repository
public interface IEducationRepository extends JpaRepository<Education, Long> {

}
