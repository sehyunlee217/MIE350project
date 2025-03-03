package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class Person {

    @Id
    private long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Nullable
    private String initial;

    @Email
    @NotEmpty
    private String email;

}
