package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;

import java.util.ArrayList;
import java.util.List;

class FacilityLocationTest {

    private List<FacilityLocation> locationList;
    private List<FacilityRoom> roomList;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
        locationList = new ArrayList<>();
        roomList = new ArrayList<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() throws Exception{
        locationList = null;
        roomList = null;
    }

    @org.junit.jupiter.api.Test
    void addFacilityLocation() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);
        locationList.add(facility);
        assertEquals(true, locationList.contains(facility));     }

    @org.junit.jupiter.api.Test
    void removeFacilityLocation() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);
        locationList.add(facility);
        locationList.remove(facility);
        assertTrue(locationList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addFacilityRoom() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facility);
        roomList.add(facilityRoom1);
        assertEquals(true, roomList.contains(facilityRoom1));
    }

    @org.junit.jupiter.api.Test
    void removeFacilityRoom() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facility);
        roomList.remove(facilityRoom1);
        assertTrue(roomList.isEmpty());
    }
}