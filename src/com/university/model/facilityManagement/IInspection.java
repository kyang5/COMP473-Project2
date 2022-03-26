package com.university.model.facilityManagement;

import com.university.model.facility.FacilityRoom;
import com.university.model.facility.IFacilityRoom;

import java.util.List;

public interface IInspection {
    public IFacilityRoom getFacilityRoom();
    public void setFacilityRoom(IFacilityRoom facilityRoom);
    public String getInspectionName();
    public int getInspectionID();
    public void setInspectionName(String inspectionName);
    public void setInspectionID(int inspectionID);
    public void addInspector(IInspector inspector);
    public void removeInspector(IInspector inspector);
    public IInspector getInspector();
    public void setInspector(IInspector inspector);
    public List<IInspector> getInspectorList();
    public void setInspectorList(List <IInspector> inspectorList);
}
