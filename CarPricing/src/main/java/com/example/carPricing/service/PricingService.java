package com.example.carPricing.service;

import com.example.carPricing.domain.price.Price;

import com.example.carPricing.domain.price.PriceRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implements the pricing service to get prices for each vehicle.
 */
@Service
@Transactional
public class PricingService {

    private final PriceRepository repository;

    PricingService(PriceRepository priceRepository) {
        this.repository = priceRepository;
    }

    /**
     * If a valid vehicle ID, gets the price of the vehicle from the in memory database.
     * @param vehicleId ID number of the vehicle the price is requested for.
     * @return price of the requested vehicle
     * @throws PriceException vehicleID was not found
     */
    public Price getPrice(Long vehicleId) throws PriceException {

        Optional<Price> price = repository.findById(vehicleId);
        if (price.isEmpty()) {
            throw new PriceException("Cannot find price for Vehicle " + vehicleId);
        }

        return price.get();
    }
}
