package com.sprint.part2.sb1hrbankteam03.entity;

import java.time.LocalDateTime;

public class Backup extends BaseEntity {
  String workerIp;
  BackupStatus status;
  LocalDateTime startAt;
  LocalDateTime endAt;
}
