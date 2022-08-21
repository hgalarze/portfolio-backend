package com.hgalarze.portfolio.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'FirstName' field must contain between 1 and 50 characters")
    private String FirstName;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'LastName' field must contain between 1 and 50 characters")
    private String LastName;

    @NotNull
    @Range(min = 1, message = "The 'Age' field must be greater than 0")
    private Integer Age;

    @NotNull
    private String Email;

    @NotNull
    @Size(min = 32, max = 32, message = "Invalid 'Password' field length")
    private String Password;

    private String AvatarUrl;

    @NotNull
    private Timestamp CreatedOn;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'CreatedBy' field must contain between 1 and 50 characters")
    private String CreatedBy;

    @NotNull
    private Timestamp UpdatedOn;

    @NotNull
    @Size(min = 1, max = 50, message = "The 'UpdatedBy' field must contain between 1 and 50 characters")
    private String UpdatedBy;

    private Timestamp DeletedOn;

    @Size(min = 0, max = 50, message = "The 'DeletedBy' field must contain between 1 and 50 characters")
    private String DeletedBy;

    @NotNull
    private Boolean Deleted;
}
