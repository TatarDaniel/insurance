package com.insurance.app.insurance.hospital;

import com.insurance.app.insurance.specialization.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;
    private final SpecializationRepository specializationRepository;


    @Autowired
    public HospitalService(HospitalRepository hospitalRepository, SpecializationRepository specializationRepository) {
        this.hospitalRepository = hospitalRepository;
        this.specializationRepository = specializationRepository;
    }

    public List<Hospital> getAll() {
        return hospitalRepository.findAll();
    }

    public void addHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    public List<Hospital> getHospitalBySpecialization(String specialization) {
        ;
        return hospitalRepository.findHospitalBySpecialization_Name(specialization);
    }
}
