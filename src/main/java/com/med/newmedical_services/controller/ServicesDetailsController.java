package com.med.newmedical_services.controller;

import com.med.newmedical_services.dto.ServicesDetailsDtos;
import com.med.newmedical_services.service.ServicesDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ServicesDetailsController {

    @Autowired
    private ServicesDetailsService servicesDetailsService;

    @GetMapping("/details")
    public ResponseEntity<Object> getServicesDetails() {

        Optional<List<ServicesDetailsDtos>> servicesDetailsDtosList = servicesDetailsService.getServicesDetails();
        return servicesDetailsDtosList.isPresent() ? ResponseEntity.ok(servicesDetailsDtosList) : ResponseEntity.notFound().build();
    }
}
