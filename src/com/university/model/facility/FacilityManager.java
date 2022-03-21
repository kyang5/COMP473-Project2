package com.university.model.facility;

import java.util.ArrayList;
import java.util.List;

public class FacilityManager {
    private String managerFirstName;
    private String managerLastName;
    private int managerId;
    private List<FacilityLocation> listFacilities = new ArrayList<>();

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public List<FacilityLocation> getListFacilities() {
        return listFacilities;
    }

    public void setListFacilities(List<FacilityLocation> listFacilities) {
        this.listFacilities = listFacilities;
    }

    public void addFacilities(FacilityLocation facilityLocation) {
        listFacilities.add(facilityLocation);
    }

    public void removeFacilities(FacilityLocation facilityLocation) {
        listFacilities.remove(facilityLocation);
    }
}