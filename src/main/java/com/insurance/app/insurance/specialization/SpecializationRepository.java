package com.insurance.app.insurance.specialization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    //Optional<Specialization> getSpecializationByName(String name);
    List<Specialization> getSpecializationByName(String name);
    List<Specialization> getByName(String name);
}
