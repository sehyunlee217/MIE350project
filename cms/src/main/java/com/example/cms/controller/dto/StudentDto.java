package com.example.cms.controller.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.Nullable;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
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

    private CourseMark mark;
    private Department departmentCode;
   
}
