package com.hgalarze.portfolio.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "title")
    private String Title;

    @Column(name = "summary")
    private String Summary;

    @Column(name = "year")
    private Integer Year;

    @Column(name = "picture")
    private String Picture;

    @Column(name = "github_url")
    private String Github;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Profile.class)
    @JoinColumn(name = "id")
    private Profile Profile;
}
