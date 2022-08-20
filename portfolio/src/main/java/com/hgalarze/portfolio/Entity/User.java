package com.hgalarze.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    private String AvatarUrl;
}
