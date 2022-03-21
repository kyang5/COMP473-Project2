package com.university.model.facility;

public class FacilityRoom {
    private int phoneNumber;
    private int facilityRoomId;
    private int roomNumber;
    private int capacity;
    private FacilityLocation facilityLocation;
    private boolean inUse;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFacilityRoomId() {
        return facilityRoomId;
    }

    public void setFacilityRoomId(int facilityId) {
        this.facilityRoomId = facilityId;
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

    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}