package com.example.vehiclesapi.Controllers;


import com.example.vehiclesapi.Domain.Car.Car;
import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Maps the CarController to the Car class using HATEOAS
 */
@Component
public class CarResourceAssembler {


    public Resource<Car> toResource(Car car) {
        return new Resource(car,
                linkTo(methodOn(CarController.class).get(car.getId())).withSelfRel(),
                linkTo(methodOn(CarController.class).list()).withRel("cars"));

    }
}
