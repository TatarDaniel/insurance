package com.insurance.app.insurance.branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    private final BranchRepository branchRepository;


    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

    public void addBranch(Branch branch) {
        branchRepository.save(branch);
    }


}
