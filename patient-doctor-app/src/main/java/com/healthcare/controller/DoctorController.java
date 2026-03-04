package com.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.healthcare.entity.Doctor;
import com.healthcare.service.DoctorService;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin("*")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctor> getDoctors() {
        return doctorService.getAllDoctors();
    }
    
    @GetMapping("/speciality/{speciality}")
    public List<Doctor> getDoctorsBySpeciality(@PathVariable String speciality) {

        System.out.println("FILTERING DOCTORS BY: " + speciality);

        return doctorService.getDoctorsBySpeciality(speciality);
    }



    @PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }
}
