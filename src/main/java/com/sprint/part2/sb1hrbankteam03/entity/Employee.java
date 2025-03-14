package com.sprint.part2.sb1hrbankteam03.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.util.Date;

public class Employee extends BaseUpdatableEntity{

  String name;
  String email;
  String employeeNumber;

  @ManyToOne
  @JoinColumn(name = "department_id")
  Department department;
  String position;
  Date hireDate;

  @Enumerated(EnumType.STRING)
  Status status;

  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "profile_id")
  FileMetaData profileImage;

}
