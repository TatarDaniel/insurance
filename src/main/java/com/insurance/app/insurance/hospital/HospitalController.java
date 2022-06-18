package com.insurance.app.insurance.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Hospital> getAll() {
        return hospitalService.getAll();
    }

    @PostMapping("/add")
    public void addHospital(@RequestBody Hospital hospital) {
        hospitalService.addHospital(hospital);
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/{specialization}")
    public List<Hospital> getHospitalBySpecialization(@PathVariable String specialization) {
        return hospitalService.getHospitalBySpecialization(specialization);
    }
}
