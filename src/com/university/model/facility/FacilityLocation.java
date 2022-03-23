package com.university.model.facility;

import java.util.List;
import java.util.ArrayList;

public class FacilityLocation implements IFacilityLocation{
    private int facilityId;
    private String name;
    private int addressNumber;
    private String streetName;
    private String city;
    private int zipcode;
    private IFacilityManager facilityManager;
    private List<IFacilityLocation> listFacilities = new ArrayList<>();
    private List<IFacilityRoom> listFacilityRooms = new ArrayList<>();

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
    public List<IFacilityLocation> getListFacilities() {
        return listFacilities;
    }

    public void setListFacilities(List<IFacilityLocation> listFacilities) {
        this.listFacilities = listFacilities;
    }

    public void addFacilityLocation (IFacilityLocation facilityLocation) {
        listFacilities.add(facilityLocation);
    }

    public void removeFacilityLocation (IFacilityLocation facilityLocation) {
        listFacilities.remove(facilityLocation);
    }

    public List<IFacilityRoom> getListFacilityRooms() {
        return listFacilityRooms;
    }

    public void setListFacilityRooms(List<IFacilityRoom> listFacilityRooms) {
        this.listFacilityRooms = listFacilityRooms;
    }

    // same as addFacilityDetail()
    public void addFacilityRoom (IFacilityRoom facilityRoom) {
        listFacilityRooms.add(facilityRoom);
    }

    public void removeFacilityRoom(IFacilityRoom facilityRoom) {
        listFacilityRooms.remove(facilityRoom);
    }

    public IFacilityManager getFacilityManager() {
        return facilityManager;
    }

    public void setFacilityManager(IFacilityManager facilityManager) {
        this.facilityManager = facilityManager;
    }

}