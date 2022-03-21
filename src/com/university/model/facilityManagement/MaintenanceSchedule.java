package com.university.model.facilityManagement;
import com.university.model.facility.FacilityRoom;

import java.util.*;

public class MaintenanceSchedule {
    //private Date maintenanceDate;
    private Date maintenanceStartDate;
    private Date maintenanceEndDate;
    private int scheduleID;
    private MaintenanceWorker maintenanceWorker;
    private FacilityRoom facilityRoom;

    public int getScheduleID(){
        return scheduleID;
    }
    public void setScheduleID(int scheduleID){
        this.scheduleID = scheduleID;
    }
    public Date getMaintenanceStartDate(){
        return maintenanceStartDate;
    }
    public void setMaintenanceStartDate(Date maintenanceStartDate){
        this.maintenanceStartDate = maintenanceStartDate;
    }
    public Date getMaintenanceEndDate(){
        return maintenanceEndDate;
    }
    public void setMaintenanceEndDate(Date maintenanceEndDate){
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public MaintenanceWorker getMaintenanceWorker(){
        return maintenanceWorker;
    }
    public void setMaintenanceWorker(MaintenanceWorker maintenanceWorker){
        this.maintenanceWorker = maintenanceWorker;
    }

    public FacilityRoom getFacilityRoom() {
        return facilityRoom;
    }

    public void setFacilityRoom(FacilityRoom facilityRoom) {
        this.facilityRoom = facilityRoom;
    }

    public long calcDownTimeForFacilityRoom(Date maintenanceStartDate, Date maintenanceEndDate){
        long startDate = maintenanceStartDate.getTime();
        long endDate = maintenanceEndDate.getTime();
        long downTime = endDate - startDate;
        return downTime;
    }
}

