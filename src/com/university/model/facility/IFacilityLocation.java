package com.university.model.facility;

import java.util.List;

public interface IFacilityLocation {
    public int getFacilityId();
    public void setFacilityId(int facilityId);
    public String getName();
    public void setName(String name);
    public int getAddressNumber();
    public void setAddressNumber(int addressNumber);
    public String getStreetName();
    public void setStreetName(String streetName);
    public String getCity();
    public void setCity(String city);
    public int getZipcode();
    public void setZipcode(int zipcode);
    public List<IFacilityLocation> getListFacilities();
    public void setListFacilities(List<IFacilityLocation> listFacilities);
    public void addFacilityLocation(IFacilityLocation facilityLocation);
    public void removeFacilityLocation(IFacilityLocation facilityLocation);
    public List<IFacilityRoom> getListFacilityRooms();
    public void setListFacilityRooms(List<IFacilityRoom> listFacilityRooms);
    public void addFacilityRoom(IFacilityRoom facilityRoom);
    public void removeFacilityRoom(IFacilityRoom facilityRoom);
    public IFacilityManager getFacilityManager();
    public void setFacilityManager(IFacilityManager facilityManager);

}
