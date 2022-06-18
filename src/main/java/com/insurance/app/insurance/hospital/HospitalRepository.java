package com.insurance.app.insurance.hospital;

import com.insurance.app.insurance.specialization.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    @Query("SELECT h from Hospital h join Specialization s where s.name = :name")
    List<Hospital> findBySpecializationName(@Param("name") String name);
    List<Hospital> findHospitalBySpecialization_Name(String specialization);
}
