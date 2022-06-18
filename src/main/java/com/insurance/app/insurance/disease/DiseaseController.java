package com.insurance.app.insurance.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/disease")
public class DiseaseController {

    private final DiseaseService diseaseService;

    @Autowired
    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Disease> getAll() {
        return diseaseService.getAll();
    }

    @PostMapping("/add")
    public void addDisease(@RequestBody Disease disease) {
        diseaseService.addDisease(disease);
    }

//    @CrossOrigin(origins = "http://localhost:3000/")
//    @GetMapping("/list/{specialization}")
//    public List<Disease> getHospitalBySpecialization(@PathVariable String specialization) {
//        return diseaseService.getHospitalBySpecialization(specialization);
//    }
}
