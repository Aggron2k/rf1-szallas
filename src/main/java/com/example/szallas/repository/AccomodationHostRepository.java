package com.example.szallas.repository;

import com.example.szallas.model.AccomodationHost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccomodationHostRepository extends JpaRepository<AccomodationHost, Integer> {
}
