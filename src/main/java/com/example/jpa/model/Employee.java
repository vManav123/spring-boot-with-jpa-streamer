package com.example.jpa.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false ,unique = true)
    private BigInteger id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "age")
    private long age;

    @Column(name = "active", nullable = false)
    private Boolean active;
}
