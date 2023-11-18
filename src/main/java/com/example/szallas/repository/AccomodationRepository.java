package com.example.szallas.repository;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.AccomodationHost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AccomodationRepository extends JpaRepository<Accomodation, Integer> {
    @Query("SELECT a FROM Accomodation a " +
            "LEFT JOIN a.reservations r " +
            "LEFT JOIN a.rooms sz " +
            "WHERE a.city = :hova AND (r IS NULL OR r.check_in_date > :befejezesDatum OR r.check_out_date < :kezdesDatum OR sz.capacity <= :minCapacity)")
    List<Accomodation> findByElerhetoSzallasok(@Param("kezdesDatum") LocalDate kezdesDatum,
                                               @Param("befejezesDatum") LocalDate befejezesDatum,
                                               @Param("minCapacity") int minCapacity,
                                               @Param("hova") String hova);

    List<Accomodation> findAllByAccomodationHostId(Integer accomodationHostId);
}
