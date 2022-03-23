package test.java;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityManager;
import com.university.model.facility.FacilityRoom;
import com.university.model.use.Type;
import com.university.model.use.UseSchedule;
import com.university.model.use.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UseScheduleTest {
    private int availableCapacity;
    private int occupancy;
    private double usageRate;
    private List<Type> listActualUsage = new ArrayList<>();
    private List<User> listUsers = new ArrayList<>();
    private List<FacilityRoom> listFacilityRoomsInUse = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        int availableCapacity;
        int occupancy;
        double usageRate;
        List<Type> listActualUsage = new ArrayList<>();
        List<User> listUsers = new ArrayList<>();
        List<FacilityRoom> facilityRooms = new ArrayList<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        listActualUsage = null;
        listUsers = null;
        listFacilityRoomsInUse = null;
    }

    @org.junit.jupiter.api.Test
    void requestAvailableCapacity() {

        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);
        type.setUseStartDate(new Date(2020, 12, 1, 13, 45));
        type.setUseEndDate(new Date(2020, 12, 22, 10, 15));
        type.setOccupancy(10);

        User user = new User();
        user.setUserFirstName("Bob");
        user.setUserLastName("Tom");
        user.setUserId(1);
        user.setUserTitle("Professor");

        UseSchedule useSchedule = new UseSchedule();
        useSchedule.requestAvailableCapacity(facilityRoom1, type);
        useSchedule.addActualUsage(type);
        useSchedule.assignUserToFacilityRoom(user);

        assertEquals(0, useSchedule.requestAvailableCapacity(facilityRoom1, type));
    }

    @org.junit.jupiter.api.Test
    void assignUserToFacilityRoom() {
        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);
        facilityManager.addFacilities(facilityLocation);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);
        facilityLocation.addFacilityRoom(facilityRoom1);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);
        type.setUseStartDate(new Date(2020, 12, 1, 13, 45));
        type.setUseEndDate(new Date(2020, 12, 22, 10, 15));
        type.setOccupancy(10);

        User user = new User();
        user.setUserFirstName("Bob");
        user.setUserLastName("Tom");
        user.setUserId(1);
        user.setUserTitle("Professor");
        user.setUseType(type);

        listUsers.add(user);

        assertEquals(true, listUsers.contains(user));
    }

    @org.junit.jupiter.api.Test
    void vacateFacilityRoom() {
        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);
        facilityManager.addFacilities(facilityLocation);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);
        facilityLocation.addFacilityRoom(facilityRoom1);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);

        User user = new User();
        user.setUserFirstName("Bob");
        user.setUserLastName("Tom");
        user.setUserId(1);
        user.setUserTitle("Professor");
        user.setUseType(type);

        listUsers.add(user);
        listUsers.remove(user);

        assertTrue(listUsers.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addActualUsage() {
        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);

        listActualUsage.add(type);

        assertEquals(true, listActualUsage.contains(type));
    }

    @org.junit.jupiter.api.Test
    void removeActualUsage() {
        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);

        listActualUsage.add(type);
        listActualUsage.remove(type);

        assertTrue(listActualUsage.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void calculateUsage() {
        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);
        facilityManager.addFacilities(facilityLocation);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);

        UseSchedule useSchedule = new UseSchedule();
        listFacilityRoomsInUse.add(facilityRoom1);

        double result = useSchedule.calculateUsage(listFacilityRoomsInUse);

        assertEquals(1.0, result);
    }

    @org.junit.jupiter.api.Test
    void timeInterval() {

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setUseStartDate(new Date(2020, 12, 1, 13, 45));
        type.setUseEndDate(new Date(2020, 12, 22, 10, 15));
        type.setOccupancy(10);

        UseSchedule useSchedule = new UseSchedule();
        useSchedule.addActualUsage(type);

        long result = useSchedule.timeInterval(type);

        assertEquals(1801800000, result);
    }

    void addFacilityRoomToListFacilityRoomsInUse() {

    }
}