package com.ravindra.University_Event_Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentModel {

    @Id
    private int studentId;
    @Pattern(regexp = "[A-Z][a-z]*", message = "Only First letter must be capital")
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(25)
    private int age;
    @Enumerated(EnumType.STRING)
    private Department department;

}
