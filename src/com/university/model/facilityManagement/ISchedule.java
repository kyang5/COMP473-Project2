package com.university.model.facilityManagement;

import com.university.model.facility.IFacilityRoom;

import java.util.Date;

public interface ISchedule {
    public int getScheduleID();
    public void setScheduleID(int scheduleID);
    public Date getMaintenanceStartDate();
    public void setMaintenanceStartDate(Date maintenanceStartDate);
    public Date getMaintenanceEndDate();
    public void setMaintenanceEndDate(Date maintenanceEndDate);
    public IWorker getMaintenanceWorker();
    public void setMaintenanceWorker(IWorker maintenanceWorker);
    public IFacilityRoom getFacilityRoom();
    public void setFacilityRoom(IFacilityRoom facilityRoom);
    public long calcDownTimeForFacilityRoom(Date maintenanceStartDate, Date maintenanceEndDate);
}
