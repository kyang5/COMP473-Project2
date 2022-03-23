package com.university.model.use;

import com.university.model.facility.IFacilityLocation;
import com.university.model.facility.IFacilityRoom;

import java.util.*;

public class UseSchedule implements IUseSchedule{
    private int availableCapacity;
    private double usageRate;
    // date and time entered at the same time in same variable
    private List<IType> listActualUsage = new ArrayList<>();
    private List<IUser> listUsers = new ArrayList<>();
    private List<IFacilityRoom> listFacilityRoomsInUse = new ArrayList<>();

    public boolean isAtCapacity() {
        if (availableCapacity == 0) {
            return true;
        } else {
            return false;}
    }

    public int requestAvailableCapacity(IFacilityRoom room, IType facilityUseType) {
        availableCapacity = room.getCapacity() - facilityUseType.getOccupancy();
        return availableCapacity;
    }

    // get list of users, room they are using and what they are using the room for
    public List<IUser> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<IUser> listUsers) {
        this.listUsers = listUsers;
    }

    public void assignUserToFacilityRoom(IUser user) {
        listUsers.add(user);
    }

    public void vacateFacilityRoom(IUser user) {
        // remove user and the facility use type from facility room
        listUsers.remove(user);
    }

    public List<IType> getListActualUsage() {
        return listActualUsage;
    }

    public void setListActualUsage(List<IType> listActualUsage) {
        this.listActualUsage = listActualUsage;
    }

    // add a facility room and its use type to list of actual usage
    public void addActualUsage (IType facilityUseType) {
        listActualUsage.add(facilityUseType);
    }

    public void removeActualUsage(IType facilityUseType) {
        listActualUsage.remove(facilityUseType);
    }

    // get a list of all facility rooms that are in use
    public List<IFacilityRoom> getListFacilityRoomsInUse() {
        return listFacilityRoomsInUse;
    }

    public void setListFacilityRoomsInUse(List<IFacilityRoom> listFacilityRoomsInUse) {
        this.listFacilityRoomsInUse = listFacilityRoomsInUse;
    }

    public void addFacilityRoomToListFacilityRoomsInUse(IType useType) {
        listFacilityRoomsInUse.add(useType.getFacilityRoom());
    }

    // calculate use rate of a room
    public double calculateUsage(IFacilityLocation facilityLocation) {
        // total number of rooms in a facility out of total number of rooms in a facility being used
        double totalRoomsInUse = 0.0;
        double totalRooms = facilityLocation.getListFacilityRooms().size();
        for (IFacilityRoom room : facilityLocation.getListFacilityRooms()) {
            for (IType useType : listActualUsage) {
                if (useType.getFacilityRoom().equals(room)) {
                    totalRoomsInUse += 1;
                }
            }
        }
        usageRate = totalRoomsInUse / totalRooms;
        return usageRate;
    }

    // how long a room is in use
    public long timeInterval(IType facilityUseType) {
        long end = facilityUseType.getUseEndDate().getTime();
        long start = facilityUseType.getUseStartDate().getTime();
        long duration = end - start; //time duration in milliseconds
        return duration;
    }
}