package com.university.model.facility;

import java.util.List;

public interface IFacilityManager {
    public String getManagerFirstName();
    public void setManagerFirstName(String managerFirstName);
    public String getManagerLastName();
    public void setManagerLastName(String managerLastName);
    public int getManagerId();
    public void setManagerId(int managerId);
    public List<IFacilityLocation> getListFacilities();
    public void setListFacilities(List<IFacilityLocation> listFacilities);
    public void addFacilities(IFacilityLocation facilityLocation);
    public void removeFacilities(IFacilityLocation facilityLocation);
}