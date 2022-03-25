package com.university.model.facility;

public interface IFacilityRoom {
    int getPhoneNumber();
    void setPhoneNumber(int phoneNumber);
    int getFacilityRoomId();
    void setFacilityRoomId(int facilityRoomId);
    int getRoomNumber();
    void setRoomNumber(int roomNumber);
    int getCapacity();
    void setCapacity(int capacity);
    IFacilityLocation getFacilityLocation();
    void setFacilityLocation(IFacilityLocation facilityLocation);
    boolean isInUse();
    void setInUse(boolean inUse);
}
