package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/save")
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
        // Select * from doctor where specialist=
    }
}
