package com.university.model.use;

import com.university.model.facility.IFacilityRoom;
import java.util.*;

public interface IType {
    public int getTypeId();
    public void setTypeId(int typeId);
    public String getFacilityUseType();
    public void setFacilityUseType(String facilityUseType);
    public IFacilityRoom getFacilityRoom();
    public void setFacilityRoom(IFacilityRoom facilityRoom);
    public Date getUseStartDate();
    public void setUseStartDate(Date useStartDate);
    public Date getUseEndDate();
    public void setUseEndDate(Date useEndDate);
    public int getOccupancy();
    public void setOccupancy(int occupancy);


}
