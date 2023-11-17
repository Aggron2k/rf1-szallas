package com.example.szallas.repository;

import com.example.szallas.model.AccomodationHost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccomodationHostRepository extends JpaRepository<AccomodationHost, Integer> {
    Optional<AccomodationHost> findByUserId(Integer userid);
}
