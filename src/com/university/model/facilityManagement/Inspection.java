package com.university.model.facilityManagement;
import com.university.model.facility.FacilityRoom;

import java.util.ArrayList;
import java.util.List;

public class Inspection {
    private String inspectionName;
    private int inspectionID;
    private Inspector inspector;
    private FacilityRoom facilityRoom;
    private List<Inspector> inspectorList = new ArrayList<>();


    public FacilityRoom getFacilityRoom(){
        return facilityRoom;
    }

    public void setFacilityRoom(FacilityRoom facilityRoom){
        this.facilityRoom = facilityRoom;
    }

    public String getInspectionName() {
        return inspectionName;
    }

    public int getInspectionID(){
        return inspectionID;
    }
    public void setInspectionName(String inspectionName){
        this.inspectionName = inspectionName;
    }

    public void setInspectionID(int inspectionID){
        this.inspectionID = inspectionID;
    }

    public void addInspector(Inspector inspector){
        inspectorList.add(inspector);
    }
    public void removeInspector(Inspector inspector){
        inspectorList.remove(inspector);
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public List<Inspector> getInspectionList(){
        return inspectorList;
    }



}


