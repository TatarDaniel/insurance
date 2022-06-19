package com.insurance.app.insurance.branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/branch")
public class BranchController {

    private final BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Branch> getAll() {
        return branchService.getAll();
    }

    @PostMapping("/add")
    public void addBranch(@RequestBody Branch branch) {
        branchService.addBranch(branch);
    }

//    @CrossOrigin(origins = "http://localhost:3000/")
//    @GetMapping("/list/{specialization}")
//    public List<Disease> getHospitalBySpecialization(@PathVariable String specialization) {
//        return diseaseService.getHospitalBySpecialization(specialization);
//    }
}
