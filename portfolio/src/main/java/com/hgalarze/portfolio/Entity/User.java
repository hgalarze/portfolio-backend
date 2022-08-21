package com.hgalarze.portfolio.Entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "profiles_id")
    private Long ProfileId;

    @Column(name = "username")
    private String Username;

    @NotNull
    @Size(min = 32, max = 32, message = "Invalid 'Password' field length")
    @Column(name = "password")
    private String Password;

    @NotNull
    @Column(name = "deleted")
    private Boolean Deleted;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'CreatedBy' field must contain between 1 and 50 characters")
    @Column(name = "created_by")
    private String CreatedBy;

    @NotNull
    @Column(name = "created_on")
    private Timestamp CreatedOn;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'UpdatedBy' field must contain between 1 and 50 characters")
    @Column(name = "updated_by")
    private String UpdatedBy;

    @NotNull
    @Column(name = "updated_on")
    private Timestamp UpdatedOn;

    @Size(min = 0, max = 50, message = "The 'DeletedBy' field must contain between 1 and 50 characters")
    @Column(name = "deleted_by")
    private String DeletedBy;

    @Column(name = "deleted_on")
    private Timestamp DeletedOn;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile Profile;
}
