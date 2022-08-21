package com.hgalarze.portfolio.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "studies")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "title")
    private String Title;

    @Column(name = "institute")
    private String Institution;

    @Column(name = "summary")
    private String Summary;

    @Column(name = "from_date")
    private Date From;

    @Column(name = "to_date")
    private Date To;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Profile.class)
    @JoinColumn(name = "id")
    private Profile Profile;
}
