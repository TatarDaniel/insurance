package com.insurance.app.insurance.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService){
        this.hospitalService = hospitalService;
    }

    @GetMapping("/list")
    public List<Hospital> getAll() {
        return hospitalService.getAll();
    }

    @PostMapping("/add")
    public void addHospital(@RequestBody Hospital hospital){
        hospitalService.addHospital(hospital);
    }
}
