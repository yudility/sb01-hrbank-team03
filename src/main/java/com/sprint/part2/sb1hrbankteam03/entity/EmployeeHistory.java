package com.sprint.part2.sb1hrbankteam03.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.Instant;

public class EmployeeHistory extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "employee_id")
  Employee employee;

  @Enumerated(EnumType.STRING)
  ChangeType changeType;

  String description;
  String ipAddress;
  Instant editedAt;
}
