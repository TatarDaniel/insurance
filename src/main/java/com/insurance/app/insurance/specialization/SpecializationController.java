package com.insurance.app.insurance.specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/specialization")
public class SpecializationController {

    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService){
        this.specializationService = specializationService;
    }

    @GetMapping("/list")
    public List<Specialization> getSpecializations(){
        return specializationService.getSpecializations();
    }

    @GetMapping("/list/{name}")
    @ResponseBody
    public List<Specialization> getSpecializationsByName(@PathVariable String name){
        return specializationService.getSpecializationsByName(name);
    }

    @PostMapping("/add")
    public void addSpecialization(@RequestBody Specialization specialization){
        specializationService.addSpecialization(specialization);
    }

}
