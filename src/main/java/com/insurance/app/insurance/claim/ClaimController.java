package com.insurance.app.insurance.claim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/claim")
public class ClaimController {

    private final ClaimService claimService;

    @Autowired
    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Claim> getAll() {
        return claimService.getAll();
    }


    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/{user}")
    public List<Claim> getClaimByUser(@PathVariable long user) {
        return claimService.getClaimByUser(user);
    }

    @PostMapping("/add")
    public void addClaim(@RequestBody Claim claim) {
        claimService.addClaim(claim);
    }

//    @CrossOrigin(origins = "http://localhost:3000/")
//    @GetMapping("/list/{specialization}")
//    public List<Claim> getHospitalBySpecialization(@PathVariable String specialization){
//        return claimService.getHospitalBySpecialization(specialization);
//    }
}
