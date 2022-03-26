package com.university.model.facilityManagement;

import com.university.model.facility.IFacilityRoom;

import java.util.Date;

public interface IRequest {
    public int getRequestID();
    public Date getRequestDate();
    public String getRequestStatus();
    public int getRequestorID();
    public String getRequestType();
    public String getProblem();
    public void setProblem(String problem);
    public void setRequestType(String requestType);
    public void setRequestID(int requestID);
    public void setRequestDate(Date requestDate);
    public void setRequestorID(int requestorID);
    public void setRequestStatus(String requestStatus);
    public IFacilityRoom getFacilityRoom();
    public void setFacilityRoom(IFacilityRoom facilityRoom);
}
