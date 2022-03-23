package com.university.model.use;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;

import java.time.LocalDateTime;
import java.util.*;

public class UseSchedule {
    private int availableCapacity;
    private double usageRate;
    // date and time entered at the same time in same variable
    private List<Type> listActualUsage = new ArrayList<>();
    private List<User> listUsers = new ArrayList<>();
    private List<FacilityRoom> listFacilityRoomsInUse = new ArrayList<>();

    public boolean isAtCapacity() {
        if (availableCapacity == 0) {
            return true;
        } else {
            return false;}
    }

    public int requestAvailableCapacity(FacilityRoom room, Type facilityUseType) {
        availableCapacity = room.getCapacity() - facilityUseType.getOccupancy();
        return availableCapacity;
    }

    // get list of users, room they are using and what they are using the room for
    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public void assignUserToFacilityRoom(User user) {
        listUsers.add(user);
    }

    public void vacateFacilityRoom(User user) {
        // remove user and the facility use type from facility room
        listUsers.remove(user);
    }

    public List<Type> getListActualUsage() {
        return listActualUsage;
    }

    public void setListActualUsage(List<Type> listActualUsage) {
        this.listActualUsage = listActualUsage;
    }

    // add a facility room and its use type to list of actual usage
    public void addActualUsage (Type facilityUseType) {
        listActualUsage.add(facilityUseType);
    }

    public void removeActualUsage(Type facilityUseType) {
        listActualUsage.remove(facilityUseType);
    }

    // get a list of all facility rooms that are in use
    public List<FacilityRoom> getListFacilityRoomsInUse() {
        return listFacilityRoomsInUse;
    }

    public void setListFacilityRoomsInUse(List<FacilityRoom> listFacilityRoomsInUse) {
        this.listFacilityRoomsInUse = listFacilityRoomsInUse;
    }

    public void addFacilityRoomToListFacilityRoomsInUse(Type useType) {
        listFacilityRoomsInUse.add(useType.getFacilityRoom());
    }

    // calculate use rate of a room
    public double calculateUsage(List<FacilityRoom> listFacilityRoomsInUse) {
        // total number of rooms in a facility out of total number of rooms in a facility being used
        double totalRoomsInUse = 0.0;
        double totalRooms = 0;
        for(FacilityRoom facilityRoom: listFacilityRoomsInUse) {
            totalRooms += 1;
            if (facilityRoom.isInUse()) {
                totalRoomsInUse += 1;
            }
        }
        usageRate = totalRoomsInUse / totalRooms;
        return usageRate;
    }

    // how long a room is in use
    public long timeInterval(Type facilityUseType) {
        long end = facilityUseType.getUseEndDate().getTime();
        long start = facilityUseType.getUseStartDate().getTime();
        long duration = end - start; //time duration in milliseconds
        return duration;
    }



}