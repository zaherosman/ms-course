package com.zaher.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaher.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
