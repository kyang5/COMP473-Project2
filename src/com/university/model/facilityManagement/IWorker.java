package com.university.model.facilityManagement;

public interface IWorker {
    public String getMaintFirstName();
    public String getMaintLastName();
    public int getMaintWorkerID();
    public String getMaintTitle();
    public void setMaintFirstName(String firstName);
    public void setMaintLastName(String lastName);
    public void setMaintWorkerID(int maintenanceWorkerID);
    public void setMaintTitle(String title);
}
