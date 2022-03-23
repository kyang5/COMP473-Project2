package com.university.model.facility;

public interface IFacilityRoom {
    public int getPhoneNumber();
    public void setPhoneNumber(int phoneNumber);
    public int getFacilityRoomId();
    public void setFacilityRoomId(int facilityRoomId);
    public int getRoomNumber();
    public void setRoomNumber(int roomNumber);
    public int getCapacity();
    public void setCapacity(int capacity);
    public IFacilityLocation getFacilityLocation();
    public void setFacilityLocation(IFacilityLocation facilityLocation);
}
