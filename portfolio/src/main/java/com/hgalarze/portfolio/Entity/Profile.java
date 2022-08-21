package com.hgalarze.portfolio.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "profile_id")
    private Long ProfileId;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "birth_date")
    private Date BirthDate;

    @Column(name = "citizenship")
    private String Citizenship;

    @Column(name = "biography")
    private String Biography;

    @Column(name = "job")
    private String Job;

    @Column(name = "picture")
    private String Picture;

    @Column(name = "phone_number")
    private String PhoneNumber;

    @Column(name = "email")
    private String Email;

    @Column(name = "linkedin_url")
    private String LinkedIn;

    @Column(name = "github_url")
    private String Github;

    @Column(name = "instagram_url")
    private String Instagram;

    @Column(name = "facebook_url")
    private String Facebook;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "Profile")
    private User User;

    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
    // "Experience")
    private List<Experience> Experiences;

    private List<Education> Studies;

    private List<Skill> Skills;

    private List<Project> Projects;
}
