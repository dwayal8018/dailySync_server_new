package com.blueTech.dailySync.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueTech.dailySync.pojo.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

	 List<Task> findByStatus(String status);
}
