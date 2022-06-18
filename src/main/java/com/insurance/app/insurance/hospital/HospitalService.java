package com.insurance.app.insurance.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public List<Hospital> getAll(){
        return hospitalRepository.findAll();
    }

    public void addHospital(Hospital hospital){
        hospitalRepository.save(hospital);
    }
}
