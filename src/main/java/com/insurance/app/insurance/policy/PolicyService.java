package com.insurance.app.insurance.policy;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {
    private final PolicyRepository policyRepository;

    public PolicyService(PolicyRepository policyRepository){
        this.policyRepository = policyRepository;
    }

    public List<Policy> getPolicies(){
        return policyRepository.findAll();
    }

    public List<Policy> getPolicyBySpecialization(String specialization){
        return policyRepository.findPolicyBySpecialization_Name(specialization);
    }
}
