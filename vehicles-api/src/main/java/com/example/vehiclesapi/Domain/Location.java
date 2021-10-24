package com.example.vehiclesapi.Domain;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * Stores information about a given location.
 * Latitude and longitude must be provided, while other
 * location information must be gathered each time from
 * the maps Controllers.
 */
@Embeddable
public class Location {

    private Double latitude;

    private Double longitude;

    @Transient
    private String address;

    @Transient
    private String city;

    @Transient
    private String state;

    @Transient
    private String zip;


    public Location(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
