package com.insurance.app.insurance.specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {
    private final SpecializationRepository specializationRepository;

    @Autowired
    public SpecializationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    public List<Specialization> getSpecializations() {
        return specializationRepository.findAll();
    }

    public void addSpecialization(Specialization specialization) {
        specializationRepository.save(specialization);
    }

    public List<Specialization> getSpecializationsByName(String name) {
        return specializationRepository.getSpecializationByName(name);
    }

    public List<Specialization> getSpecializationsByCategory(String category) {
        return specializationRepository.getSpecializationByCategory(category);
    }
}
