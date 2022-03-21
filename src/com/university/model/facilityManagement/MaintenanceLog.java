package com.university.model.facilityManagement;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;
import java.util.*;
public class MaintenanceLog {
    private int inspectionLog;
    private List<MaintenanceOrder> maintenanceList = new ArrayList<MaintenanceOrder>();
    private List<MaintenanceSchedule> scheduleList = new ArrayList<>();
    private List<MaintenanceRequest> requestList = new ArrayList<>();
    private List<Inspection> inspectionList = new ArrayList<>();
    private MaintenanceSchedule maintenanceSchedule;

    public int getInspectionLog() {

        inspectionLog = inspectionList.size();

        return inspectionLog;
    }
    public List<Inspection> getInspectionList() {
        return inspectionList;
    }

    public void setInspectionList(List<Inspection> inspectionList){
        this.inspectionList = inspectionList;
    }
    public void addInspection(Inspection inspection){
        inspectionList.add(inspection);
    }
    public void removeInspection(Inspection inspection){
        inspectionList.remove(inspection);
    }

    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest){
        requestList.add(maintenanceRequest);
    }
    public void cancelMaintenanceRequest(MaintenanceRequest maintenanceRequest){
        requestList.remove(maintenanceRequest);
    }
    public void scheduleMaintenance(MaintenanceSchedule maintenanceSchedule){
        scheduleList.add(maintenanceSchedule);
    }
    public void cancelSchedule(MaintenanceSchedule maintenanceSchedule){
        scheduleList.remove(maintenanceSchedule);
    }
    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder){
        maintenanceList.add(maintenanceOrder);
    }
    public void cancelMaintenanceOrder(MaintenanceOrder maintenanceOrder){
        maintenanceList.remove(maintenanceOrder);
    }
    public List<MaintenanceOrder> getMaintenanceOrderList(){
        return maintenanceList;
    }

    public void setMaintenanceList(List<MaintenanceOrder> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }

    public List<MaintenanceSchedule> getMaintenanceScheduleList(){
        return scheduleList;
    }

    public void setScheduleList(List<MaintenanceSchedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    // same as listFacilityProblems()
    public List<MaintenanceRequest> getMaintenanceRequestList(){
        return requestList;
    }

    public void setRequestList(List<MaintenanceRequest> requestList) {
        this.requestList = requestList;
    }

    public double calcMaintenanceCostForFacility(FacilityLocation facilityLocation){

        double totalCost = 0.0;
        for (FacilityRoom room : facilityLocation.getListFacilityRooms()) {
            for(MaintenanceOrder order: maintenanceList){
                if(order.getFacilityRoom().equals(room))
                    totalCost+=order.getCost();
            }
        }
        return totalCost;
    }

    public double calcProblemRateForFacility(FacilityLocation facilityLocation) {
        double totalProblem = 0;
        double totalRooms = 0;
        for (FacilityRoom room: facilityLocation.getListFacilityRooms()) {
            totalRooms += 1;
            for(MaintenanceRequest request: requestList) {
                if(request.getFacilityRoom().equals(room)) {
                    totalProblem +=1;
                }
            }
        }
        return totalProblem/totalRooms;
    }
}
