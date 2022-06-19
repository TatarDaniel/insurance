package com.insurance.app.insurance.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
//    @Query("SELECT h from Hospital h join Specialization s where s.name = :name")
//    List<Hospital> findBySpecializationName(@Param("name") String name);

    List<Hospital> findHospitalBySpecialization_Name(String specialization);
}
