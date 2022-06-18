package com.insurance.app.insurance.claim;

import com.insurance.app.insurance.hospital.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
//    @Query("SELECT h from Claim h join Specialization s where s.name = :name")
//    List<Claim> findBySpecializationName(@Param("name") String name);
//    List<Claim> findHospitalBySpecialization_Name(String specialization);


    @Query("SELECT c from Claim c where c.claimer_id = :id")
    List<Claim> getClaimByUser(@Param("id") long id);
}
