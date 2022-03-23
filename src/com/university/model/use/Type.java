package com.university.model.use;

import com.university.model.facility.FacilityRoom;

import java.util.Date;

public class Type {
    private String facilityUseType;
    private FacilityRoom facilityRoom;
    private Date useStartDate;
    private Date useEndDate;
    public int occupancy;

    public String getFacilityUseType() {
        return facilityUseType;
    }

    public void setFacilityUseType(String facilityUseType) {
        this.facilityUseType = facilityUseType;
    }

    // assign facility room to use type
    public FacilityRoom getFacilityRoom() {
        return facilityRoom;
    }

    public void setFacilityRoom(FacilityRoom facilityRoom) {
        this.facilityRoom = facilityRoom;
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Date getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Date useEndDate) {
        this.useEndDate = useEndDate;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

}
