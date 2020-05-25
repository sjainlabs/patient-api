package com.jlabs.controller;

import com.jlabs.model.Patient;
import com.jlabs.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sjain on 5/25/20.
 */

@RestController
@RequestMapping("/patient/v1")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> savePatient(@RequestBody Patient patient){

        final String patientResponse = patientService.savePatient(patient);
        return new ResponseEntity<>(patientResponse, HttpStatus.CREATED);

    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Patient> getPatientByName(@RequestParam String name){

        final Patient patientResponse = patientService.searchPatient(name);
        return new ResponseEntity<>(patientResponse, HttpStatus.OK);

    }
}
