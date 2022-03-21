package com.university.model.use;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;

import java.time.LocalDateTime;
import java.util.*;

public class UseSchedule {
    private int availableCapacity;
    private int occupancy;
    private double usageRate;
    private List<FacilityRoom> facilityRooms = new ArrayList<>();
    // date and time entered at the same time in same variable
    private Date useStartDate;
    private Date useEndDate;
    private List<Type> listActualUsage = new ArrayList<>();
    private List<User> listUsers = new ArrayList<>();


    public boolean isAtCapacity() {
        if (availableCapacity == 0) {
            return true;
        } else {
            return false;}
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public int requestAvailableCapacity(FacilityRoom room) {
        availableCapacity = room.getCapacity() - occupancy;
        return availableCapacity;
    }

    // get list of facility rooms
    public List<FacilityRoom> getFacilityRooms() {
        return facilityRooms;
    }

    public void setFacilityRooms(List<FacilityRoom> facilityRooms) {
        this.facilityRooms = facilityRooms;
    }

    // add facility room to list of facility rooms
    public void addFacilityRoom(FacilityRoom facilityRoom) {
        facilityRooms.add(facilityRoom);
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public void addUser(User user) {
        listUsers.add(user);
    }

    public void vacateFacilityRoom(User user) {
        // remove user from facility room
        listUsers.remove(user);
    }

    public List<Type> getListActualUsage() {
        return listActualUsage;
    }

    public void setListActualUsage(List<Type> listActualUsage) {
        this.listActualUsage = listActualUsage;
    }

    // assignFacilityToUse()
    public void addActualUsage (Type facilityUseType) {
        listActualUsage.add(facilityUseType);
    }

    public void removeActualUsage(Type facilityUseType) {
        listActualUsage.remove(facilityUseType);
    }

    public double calculateUsage(List<FacilityRoom> facilityRooms) {
        // total number of rooms in a facility out of total number of rooms in a facility being used
        double totalRoomsInUse = 0.0;
        double totalRooms = 0;
        for(FacilityRoom facilityRoom: facilityRooms) {
            totalRooms += 1;
            if (facilityRoom.isInUse()) {
                totalRoomsInUse += 1;
            }
        }
        usageRate = totalRoomsInUse / totalRooms;
        return usageRate;
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Date getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Date useEndDate) {
        this.useEndDate = useEndDate;
    }

    public long timeInterval(Date useStartDate, Date useEndDate) {
        long end = useEndDate.getTime();
        long start = useStartDate.getTime();
        long duration = end - start; //time duration in milliseconds
        return duration;
    }

}