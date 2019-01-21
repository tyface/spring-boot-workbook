package com.boot.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.ex.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>{ }
