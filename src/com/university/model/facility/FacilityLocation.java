package com.university.model.facility;

import java.util.List;
import java.util.ArrayList;

public class FacilityLocation {
    private int facilityId;
    private String name;
    private int addressNumber;
    private String streetName;
    private String city;
    private int zipcode;
    private FacilityManager facilityManager;
    private List<FacilityLocation> listFacilities = new ArrayList<>();
    private List<FacilityRoom> listFacilityRooms = new ArrayList<>();

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    // same as getFacilityInformation()
    public List<FacilityLocation> getListFacilities() {
        return listFacilities;
    }

    public void setListFacilities(List<FacilityLocation> listFacilities) {
        this.listFacilities = listFacilities;
    }

    public void addFacilityLocation (FacilityLocation facility) {
        listFacilities.add(facility);
    }

    public void removeFacilityLocation (FacilityLocation facilityLocation) {
        listFacilities.remove(facilityLocation);
    }

    public List<FacilityRoom> getListFacilityRooms() {
        return listFacilityRooms;
    }

    public void setListFacilityRooms(List<FacilityRoom> listFacilityRooms) {
        this.listFacilityRooms = listFacilityRooms;
    }

    // same as addFacilityDetail()
    public void addFacilityRoom (FacilityRoom facilityRoom) {
        listFacilityRooms.add(facilityRoom);
    }

    public void removeFacilityRoom(FacilityRoom facilityRoom) {
        listFacilityRooms.remove(facilityRoom);
    }

    public FacilityManager getFacilityManager() {
        return facilityManager;
    }

    public void setFacilityManager(FacilityManager facilityManager) {
        this.facilityManager = facilityManager;
    }

}