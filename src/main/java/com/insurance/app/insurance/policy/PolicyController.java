package com.insurance.app.insurance.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/policy")
public class PolicyController {
    private final PolicyService policyService;

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<Policy> getPolicies() {
        return policyService.getPolicies();
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/{specialization}")
    public List<Policy> getPoliciesBySpecialization(@PathVariable String specialization) {
        return policyService.getPolicyBySpecialization(specialization);
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list/hospitals/{hospital}")
    public List<Policy> getPoliciesByHospital(@PathVariable String hospital) {
        return policyService.getPolicyByHospital(hospital);
    }


}
