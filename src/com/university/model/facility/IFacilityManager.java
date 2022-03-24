package com.university.model.facility;

import java.util.List;

public interface IFacilityManager {
    public String getManagerFirstName();
    public void setManagerFirstName(String managerFirstName);
    public String getManagerLastName();
    public void setManagerLastName(String managerLastName);
    public int getManagerId();
    public void setManagerId(int managerId);
    // returns a list of all facilities a facility manager is assigned to
    public List<IFacilityLocation> getListFacilities();
    public void setListFacilities(List<IFacilityLocation> listFacilities);
    public void addFacilities(IFacilityLocation facilityLocation);
    public void removeFacilities(IFacilityLocation facilityLocation);
}
