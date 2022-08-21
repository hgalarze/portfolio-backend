package com.hgalarze.portfolio.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "experiences")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "title")
    private String Title;

    @Column(name = "intitution")
    private String Institution;

    @Column(name = "summary")
    private String Summary;

    @Column(name = "from_date")
    private Date From;

    @Column(name = "to_date")
    private Date To;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Profile.class)
    @JoinColumn(name = "id")
    private Profile Profile;
}
