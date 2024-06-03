package com.twg.springboot.mydiaryrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.mydiaryrestapi.entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {
	public List<Entry> findByUserid(long id);

}
