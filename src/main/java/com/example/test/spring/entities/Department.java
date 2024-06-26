package com.example.test.spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "departments_generator")
    @SequenceGenerator(name = "departments_generator", sequenceName = "departments_seq", allocationSize = 1)
    private Integer id;

    @Column(name="department_name")
    private String departmentName;

}
