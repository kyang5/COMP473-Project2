package com.university.model.facilityManagement;


import com.university.model.facility.IFacilityLocation;

import java.util.List;

public interface ILog {
    public int getInspectionLog();
    public List<IInspection> getInspectionList();
    public void setInspectionList(List<IInspection> inspectionList);
    public void addInspection(IInspection inspection);
    public void removeInspection(IInspection inspection);
    public void addMaintenanceRequest(IRequest maintenanceRequest);
    public void cancelMaintenanceRequest(IRequest maintenanceRequest);
    public void scheduleMaintenance(ISchedule maintenanceSchedule);
    public void cancelSchedule(ISchedule maintenanceSchedule);
    public void addMaintenanceOrder(IOrder maintenanceOrder);
    public void cancelMaintenanceOrder(IOrder maintenanceOrder);
    public List<IOrder> getMaintenanceOrderList();
    public void setMaintenanceList(List<IOrder> maintenanceList);
    public List<ISchedule> getMaintenanceScheduleList();
    public void setScheduleList(List<ISchedule> scheduleList);
    public List<IRequest> getMaintenanceRequestList();
    public void setRequestList(List<IRequest> requestList);
    public double calcMaintenanceCostForFacility(IFacilityLocation facilityLocation);
    public double calcProblemRateForFacility(IFacilityLocation facilityLocation);
}
