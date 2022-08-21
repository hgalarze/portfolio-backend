package com.hgalarze.portfolio.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    // @Column(name = "profile_id")
    // private Long ProfileId;

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

    @ManyToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile Profile;
}
