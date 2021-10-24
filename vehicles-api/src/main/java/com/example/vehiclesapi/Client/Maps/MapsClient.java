package com.example.vehiclesapi.Client.Maps;


import com.example.vehiclesapi.Domain.Location;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

/**
 * Implements a class to interface with the Maps Client for location data.
 */
@Component
public class MapsClient {

    private static final Logger log = LoggerFactory.getLogger(MapsClient.class);

    private final WebClient webClient;
    private final ModelMapper modelMapper;

    public MapsClient(WebClient webClient, ModelMapper modelMapper) {
        this.webClient = webClient;
        this.modelMapper = modelMapper;
    }


    /**
     * Gets an address from the Maps client, given latitude and longitude.
     * @param location An object containing "lat" and "lon" of location
     * @return An updated location including street, city, state and zip,
     *   or an exception message noting the Maps service is down
     */
    public Location getAddress(Location location){
        try{
            Address address = webClient.get().uri(uriBuilder -> uriBuilder
                    .path("/maps/")
                    .queryParam("latitude", location.getLatitude())
                    .queryParam("longitude", location.getLongitude())
                    .build())
                    .retrieve().bodyToMono(Address.class).block();

            modelMapper.map(address, location);
            return location;
        }catch (Exception exception){
            log.warn("Map Service is down");
            return location;
        }
    }
}
