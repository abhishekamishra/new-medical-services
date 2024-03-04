package com.med.newmedical_services.service;

import com.med.newmedical_services.dto.ServicesDetailsDtos;

import java.util.List;
import java.util.Optional;

public interface ServicesDetailsService {

    Optional<List<ServicesDetailsDtos>> getServicesDetails();
}
