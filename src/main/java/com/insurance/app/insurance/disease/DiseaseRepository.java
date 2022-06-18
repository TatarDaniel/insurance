package com.insurance.app.insurance.disease;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long> {
//    @Query("SELECT h from Disease h join Specialization s where s.name = :name")
//    List<Disease> findBySpecializationName(@Param("name") String name);
//
//    List<Disease> findHospitalBySpecialization_Name(String specialization);
}
