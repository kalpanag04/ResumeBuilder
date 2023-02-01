package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.Summary;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer> {

}
