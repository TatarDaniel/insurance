package com.insurance.app.insurance.specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/specialization")
public class SpecializationController {

    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Specialization> getSpecializations() {
        return specializationService.getSpecializations();
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/{name}")
    @ResponseBody
    public List<Specialization> getSpecializationsByName(@PathVariable String name) {
        return specializationService.getSpecializationsByName(name);
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/category/{category}")
    @ResponseBody
    public List<Specialization> getSpecializationsByCategory(@PathVariable String category) {
        return specializationService.getSpecializationsByCategory(category);
    }

    @PostMapping("/add")
    public void addSpecialization(@RequestBody Specialization specialization) {
        specializationService.addSpecialization(specialization);
    }

}
