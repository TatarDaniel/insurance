package com.insurance.app.insurance.claim;

import com.insurance.app.insurance.hospital.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/claim")
public class ClaimController {

    private final ClaimService claimService;

    @Autowired
    public ClaimController(ClaimService claimService){
        this.claimService = claimService;
    }

    @GetMapping("/list")
    public List<Claim> getAll() {
        return claimService.getAll();
    }

    @PostMapping("/add")
    public void addClaim(@RequestBody Claim claim){
        claimService.addClaim(claim);
    }

//    @GetMapping("/list/{specialization}")
//    public List<Claim> getHospitalBySpecialization(@PathVariable String specialization){
//        return claimService.getHospitalBySpecialization(specialization);
//    }
}
