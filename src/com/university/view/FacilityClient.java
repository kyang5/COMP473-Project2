package com.university.view;


import com.university.model.facility.*;
import com.university.model.use.IUser;
import com.university.model.use.Type;
import com.university.model.use.UseSchedule;
import com.university.model.use.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class FacilityClient {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        // Facility instantiation
        FacilityLocation facility1 = (FacilityLocation) context.getBean("facilityLocation");

        facility1.setFacilityId(1);
        facility1.setName("Coffee Hall");
        facility1.setAddressNumber(123);
        facility1.setStreetName("Main Ave");
        facility1.setCity("Chicago");
        facility1.setZipcode(123456);

        FacilityLocation facility2 = (FacilityLocation) context.getBean("facilityLocation");

        facility2.setFacilityId(2);
        facility2.setName("Brown Hall");
        facility2.setAddressNumber(124);
        facility2.setStreetName("Main Ave");
        facility2.setCity("Chicago");
        facility2.setZipcode(123456);


        FacilityRoom room1 = (FacilityRoom) context.getBean("facilityRoom");

        room1.setFacilityRoomId(1);
        room1.setRoomNumber(101);
        room1.setPhoneNumber("123-4567");
        room1.setCapacity(10);
        room1.setInUse(true);

        FacilityRoom room2 = (FacilityRoom) context.getBean("facilityRoom");

        room2.setFacilityRoomId(2);
        room2.setRoomNumber(102);
        room2.setPhoneNumber("123-4568");
        room2.setCapacity(9);
        room2.setInUse(true);

        FacilityRoom room3 = (FacilityRoom) context.getBean("facilityRoom");

        room3.setFacilityRoomId(3);
        room3.setRoomNumber(101);
        room3.setPhoneNumber("123-4569");
        room3.setCapacity(1);
        room3.setInUse(true);

        FacilityRoom room4 = (FacilityRoom) context.getBean("facilityRoom");

        room4.setFacilityRoomId(4);
        room4.setRoomNumber(102);
        room4.setPhoneNumber("123-4560");
        room4.setCapacity(3);
        room4.setInUse(false);

        FacilityManager manager = (FacilityManager) context.getBean("facilityManager");

        manager.setManagerId(1);
        manager.setManagerFirstName("Bob");
        manager.setManagerLastName("Doe");

        // Associate facility room with facility location 1
        facility1.addFacilityRoom(room1);
        facility1.addFacilityRoom(room2);

        // Associate facility room with facility location 2
        facility2.addFacilityRoom(room3);
        facility2.addFacilityRoom(room4);

        // Associate facility locations with facility manager
        manager.addFacilities(facility1);
        manager.addFacilities(facility2);

        /*************************************************************************************/

        // Use instantiation

        // First facility room user
        User user1 = (User) context.getBean("user");

        user1.setUserFirstName("Tom");
        user1.setUserLastName("Thumb");
        user1.setUserId(1);
        user1.setUserTitle("Professor");

        // Second facility room user
        User user2 = (User) context.getBean("user");

        user2.setUserFirstName("Bob");
        user2.setUserLastName("Doe");
        user2.setUserId(2);
        user2.setUserTitle("Facility Manager");

        // First facility use typ
        Type type1 = (Type) context.getBean("type");

        type1.setTypeId(1);
        type1.setFacilityUseType("Lab");
        type1.setUseStartDate(new Date(2020, 12, 1, 13, 45));
        type1.setUseEndDate(new Date(2020, 12, 22, 10, 15));
        type1.setOccupancy(10);

        // Second facility use type
        Type type2 = (Type) context.getBean("type");

        type2.setTypeId(1);
        type2.setFacilityUseType("Lab");
        type2.setUseStartDate(new Date(2020, 11, 1, 10, 00));
        type2.setUseEndDate(new Date(2020, 11, 1, 10, 45));
        type2.setOccupancy(1);

        // Associate facility use types with facility rooms
        type1.setFacilityRoom(room1);
        type2.setFacilityRoom(room2);

        // Associate users with facility use type
        user1.setUseType(type1);
        user2.setUseType(type2);

        // Use schedule contains list of facility room users and what the facility rooms are used for
        UseSchedule schedule = (UseSchedule) context.getBean("useSchedule");

        // Add users to use schedule
        schedule.assignUserToFacilityRoom(user1);
        schedule.assignUserToFacilityRoom(user2);

        // Add use type to use schedule
        schedule.addActualUsage(type1);
        schedule.addActualUsage(type2);

        // Print out facility management info
        System.out.println("\tFacility Manager: \t\t\t" + manager.getManagerFirstName() + " " + manager.getManagerLastName() + "\n");

        List<IFacilityLocation> facilities = manager.getListFacilities();

        for (IFacilityLocation facility : facilities) {
            System.out.println("\n\t" + "+++++++++++++++++++++++++++++++++");
            System.out.println("\tBuilding ID: \t\t" + facility.getFacilityId() + "\n");
            System.out.println("\tBuilding Name: \t\t" + facility.getName() + "\n");
            System.out.println("\tAddress: \t\t" + facility.getAddressNumber() + " " + facility.getStreetName() + "\n");
            System.out.println("\tCity: \t\t" + facility.getCity() + "\n");
            System.out.println("\tZipCode: \t\t" + facility.getZipcode() + "\n");

            List<IFacilityRoom> rooms = facility.getListFacilityRooms();

            System.out.println("\tFacility Usage Rate: \t\t" + facility.calcFacilityUsage(rooms) + "\n");

            for(IFacilityRoom room : rooms) {
                System.out.println("\n\t\t" + "+++++++++++++++++++++++++++++++++");
                System.out.println("\t\tRoom ID: \t\t" + room.getFacilityRoomId() + "\n");
                System.out.println("\t\tRoom Number: \t\t" + room.getRoomNumber() + "\n");
                System.out.println("\t\tPhone Number: \t\t" + room.getPhoneNumber() + "\n");
                System.out.println("\t\tCapacity: \t\t" + room.getCapacity() + "\n");
                System.out.println("\t\tUse Status: \t\t" + room.isInUse() + "\n");
            }
        }

        // Print facility use info
        System.out.println("\t" + "++++++++++++++++++++++++++++++++++++");
        List<IUser> users = schedule.getListUsers();
        for(IUser user : users) {
            System.out.println("\tUser ID: \t\t" + user.getUserId()+ "\n");
            System.out.println("\tUser Name: \t\t" + user.getUserFirstName() + " " + user.getUserLastName()+ "\n");
            System.out.println("\tUser Title: \t\t" + user.getUserTitle()+ "\n");
            System.out.println("\n\t" + "+++++++++++++++++++++++++++++++++");

        }


    }
}
