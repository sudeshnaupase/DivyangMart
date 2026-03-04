package com.healthcare.service;

import java.util.List;

import com.healthcare.entity.Doctor;

public interface DoctorService {
	List<Doctor> getAllDoctors();
	List<Doctor> getDoctorsBySpeciality(String speciality);
    Doctor saveDoctor(Doctor doctor);
}
