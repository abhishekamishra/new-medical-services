package com.med.newmedical_services.serviceImpl;

import com.med.newmedical_services.dto.ServicesDetailsDtos;
import com.med.newmedical_services.service.ServicesDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicesDetailsServiceImpl implements ServicesDetailsService {

    @Override
    public Optional<List<ServicesDetailsDtos>> getServicesDetails() {

        List<ServicesDetailsDtos> servicesDetailsDtosList = new ArrayList<>();

        ServicesDetailsDtos servicesDetailsDtos = new ServicesDetailsDtos();
        servicesDetailsDtos.setId(1L);
        servicesDetailsDtos.setServiceName("preventive health checks");
        servicesDetailsDtosList.add(servicesDetailsDtos);

        servicesDetailsDtos = new ServicesDetailsDtos();
        servicesDetailsDtos.setId(2L);
        servicesDetailsDtos.setServiceName("Cosmetic");
        servicesDetailsDtosList.add(servicesDetailsDtos);

        return Optional.of(servicesDetailsDtosList);
    }
}
