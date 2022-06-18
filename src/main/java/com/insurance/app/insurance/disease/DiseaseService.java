package com.insurance.app.insurance.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {

    private final DiseaseRepository diseaseRepository;


    @Autowired
    public DiseaseService(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    public List<Disease> getAll() {
        return diseaseRepository.findAll();
    }

    public void addDisease(Disease disease) {
        diseaseRepository.save(disease);
    }


}
