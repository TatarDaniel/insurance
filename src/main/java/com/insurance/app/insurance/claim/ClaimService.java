package com.insurance.app.insurance.claim;

import com.insurance.app.insurance.specialization.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    private final ClaimRepository claimRepository;
//    private final SpecializationRepository specializationRepository;


    @Autowired
    public ClaimService(ClaimRepository claimRepository ) {
        this.claimRepository = claimRepository;
    }

//    @Autowired
//    public ClaimService(ClaimRepository claimRepository, SpecializationRepository specializationRepository ) {
//        this.claimRepository = claimRepository;
//        this.specializationRepository = specializationRepository;
//    }

    public List<Claim> getAll(){
        return claimRepository.findAll();
    }

    public void addClaim(Claim claim){
        claimRepository.save(claim);
    }

//    public List<Claim> getHospitalBySpecialization(String specialization){;
//        return claimRepository.findHospitalBySpecialization_Name(specialization);
//    }
}
