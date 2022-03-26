package com.university.model.facilityManagement;

public interface IInspector {
    public String getInspectorFirstName();
    public String getInspectorLastName();
    public int getInspectorID();
    public String getInspectorTitle();
    public void setInspectorFirstName(String firstName);
    public void setInspectorLastName(String lastName);
    public void setInspectorID(int inspectorID);
    public void setInspectorTitle(String title);
}
