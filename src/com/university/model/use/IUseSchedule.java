package com.university.model.use;

import com.university.model.facility.IFacilityLocation;
import com.university.model.facility.IFacilityRoom;

import java.util.List;

public interface IUseSchedule {
    public boolean isAtCapacity();
    public int requestAvailableCapacity(IFacilityRoom room, IType facilityUseType);
    public List<IUser> getListUsers();
    public void setListUsers(List<IUser> listUsers);
    public void assignUserToFacilityRoom(IUser user);
    public void vacateFacilityRoom(IUser user);
    public List<IType> getListActualUsage();
    public void setListActualUsage(List<IType> listActualUsage);
    public void addActualUsage(IType facilityUseType);
    public void removeActualUsage(IType facilityUseType);
    public List<IFacilityRoom>  getListFacilityRoomsInUse();
    public void setListFacilityRoomsInUse(List<IFacilityRoom> listFacilityRoomsInUse);
    public void addFacilityRoomToListFacilityRoomsInUse(IType useType);
    public double calculateUsage(IFacilityLocation facilityLocation);
    public long timeInterval(IType facilityUseType);
}
