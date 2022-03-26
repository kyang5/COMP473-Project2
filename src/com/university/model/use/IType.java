package com.university.model.use;

import com.university.model.facility.IFacilityRoom;
import java.util.*;

public interface IType {
    int getTypeId();
    void setTypeId(int typeId);
    String getFacilityUseType();
    void setFacilityUseType(String facilityUseType);
    IFacilityRoom getFacilityRoom();
    void setFacilityRoom(IFacilityRoom facilityRoom);
    Date getUseStartDate();
    void setUseStartDate(Date useStartDate);
    Date getUseEndDate();
    void setUseEndDate(Date useEndDate);
    int getOccupancy();
    void setOccupancy(int occupancy);


}
