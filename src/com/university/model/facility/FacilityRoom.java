package com.university.model.facility;

public class FacilityRoom implements IFacilityRoom{
    private int phoneNumber;
    private int facilityRoomId;
    private int roomNumber;
    private int capacity;
    private IFacilityLocation facilityLocation;


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFacilityRoomId() {
        return facilityRoomId;
    }

    public void setFacilityRoomId(int facilityRoomId) {
        this.facilityRoomId = facilityRoomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public IFacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityLocation(IFacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }




}