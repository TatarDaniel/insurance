package com.insurance.app.insurance.branch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
//    @Query("SELECT h from Disease h join Specialization s where s.name = :name")
//    List<Disease> findBySpecializationName(@Param("name") String name);
//
//    List<Disease> findHospitalBySpecialization_Name(String specialization);
}
