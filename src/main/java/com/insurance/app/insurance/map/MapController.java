package com.insurance.app.insurance.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/map")
public class MapController {

//    private final HospitalService hospitalService;

    @Autowired
    public MapController() {
//        this.hospitalService = hospitalService;
    }


    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<String> getAll() {
        return List.of(
                "56.95666811940647, 24.116149176363802",
                "15.95666811940647, 13.116149176363802",
                "15.95666811940647, 24.116149176363802",
                "56.95036358383003, 24.10769315915534"
        );
    }


//    @CrossOrigin(origins = "http://localhost:3000/")
//@GetMapping("/list/{specialization}")
//    public List<Hospital> getHospitalBySpecialization(@PathVariable String specialization){
//        return hospitalService.getHospitalBySpecialization(specialization);
//    }
}
