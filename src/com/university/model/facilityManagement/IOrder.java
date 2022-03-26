package com.university.model.facilityManagement;

import com.university.model.facility.IFacilityRoom;

import java.util.Date;

public interface IOrder {
    public double getCost();
    public void setCost(double cost);
    public String getOrderType();
    public int getOrderID();
    public Date getOrderDate();
    public void setOrderType(String orderType);
    public void setOrderID(int orderID);
    public void setOrderDate(Date orderDate);
    public IFacilityRoom getFacilityRoom();
    public void setFacilityRoom(IFacilityRoom facilityRoom);
}
