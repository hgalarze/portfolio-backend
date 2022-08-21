package com.hgalarze.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hgalarze.portfolio.Entity.Profile;

@Repository
public interface IProfileRepository extends JpaRepository<Profile, Long> {

}
