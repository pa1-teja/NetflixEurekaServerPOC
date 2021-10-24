package com.example.booglemaps.Controller;

import com.example.booglemaps.Model.Address;
import com.example.booglemaps.Repositories.MockAddressRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

    @GetMapping
    public Address getAddress(@RequestParam Double latitude, @RequestParam Double longitude){
        return MockAddressRepository.getRandom();
    }
}
