package com.university.model.use;

import com.university.model.facility.FacilityRoom;

public class Type {
    private String facilityUseType;
    private FacilityRoom facilityRoom;

    public String getFacilityUseType() {
        return facilityUseType;
    }

    public void setFacilityUseType(String facilityUseType) {
        this.facilityUseType = facilityUseType;
    }

    public FacilityRoom getFacilityRoom() {
        return facilityRoom;
    }

    public void setFacilityRoom(FacilityRoom facilityRoom) {
        this.facilityRoom = facilityRoom;
    }
}
