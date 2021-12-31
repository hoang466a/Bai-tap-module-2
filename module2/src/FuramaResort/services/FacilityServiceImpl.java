package FuramaResort.services;

import FuramaResort.models.falicity.Facility;
import FuramaResort.models.falicity.House;
import FuramaResort.models.falicity.Room;
import FuramaResort.models.falicity.Villa;
import FuramaResort.models.person.Employee;
import FuramaResort.services.impl.FacilityService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner input=new Scanner(System.in);
    public static String fileHouse="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\house.csv";
    public static String fileRoom="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\room.csv";
    public static String fileVilla="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\villa.csv";
    public static Map<Facility,Integer> facilityHouse=new LinkedHashMap<>();
    public static Map<Facility,Integer> facilityVilla=new LinkedHashMap<>();
    public static Map<Facility,Integer> facilityRoom=new LinkedHashMap<>();
    static{
        Facility villa2=new Villa("SVVL-1111","200","4000","19","year","VIP","10.5","3");
        Facility house2=new House("SVHO-2222","100","1000","10","day","STANDARD","2");
        Facility room2=new Room("SVRO-3333","35","500","4","hour","123");
        Facility house3=new House("SVHO-3333","100","1000","10","day","STANDARD","2");
        facilityHouse.put(house3,5);
        facilityHouse.put(house2,2);
        facilityVilla.put(villa2,5);
        facilityRoom.put(room2,3);
        writeHouse(fileHouse,facilityHouse);
    }






    public void display(){
        for(Map.Entry<Facility,Integer>element:facilityHouse.entrySet())
        {
            System.out.println("Service "+element.getKey());
        }
        for(Map.Entry<Facility,Integer>element:facilityVilla.entrySet())
        {
            System.out.println("Service "+element.getKey());
        }
        for(Map.Entry<Facility,Integer>element:facilityRoom.entrySet())
        {
            System.out.println("Service "+element.getKey());
        }
    }

    @Override
    public void addVilla() {
        System.out.println("Enter name (SVVL-XXXX): ");
        String name=input.nextLine();
        while(!name.matches("[S][V][V][L][-][0-9]{4}"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter name: ");
            name=input.nextLine();
        }




        System.out.println("Enter usable area (More than 30 m2): ");
        String usableArea=input.nextLine();
        while(usableArea==null||!usableArea.matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }
        while(Double.parseDouble(usableArea)<=30)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }





        System.out.println("Enter rent expense (More than zero): ");
        String rentExpense=input.nextLine();
        while(rentExpense==null||!rentExpense.matches("^[1-9][0-9]+"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter rent expense: ");
            rentExpense=input.nextLine();
        }





        System.out.println("Enter the maximum capacity (no more than 20)");
        String max=input.nextLine();
        while(max==null||!max.matches("[012]{0,1}+[0-9]"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }
        while(Integer.parseInt(max)>20||Integer.parseInt(max)<0  )
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }




        System.out.println("Enter the type of rent (Month, Day, Year, Week): ");
        String type=input.nextLine();
        String typeOfRent="Month Day Year Week";
        while(type==null||!typeOfRent.contains(type))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the type of rent: ");
            type=input.nextLine();
        }



        System.out.println("Enter standard of villa (Vip,Standard, Member):");
        String standardOfVilla="Vip Standard Member";
        String standard=input.nextLine();
        while(standard==null||!standardOfVilla.contains(standard))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter standard of villa (Vip,Standard, Member):");
            standard=input.nextLine();
        }

        System.out.println("Enter the floor (more than zero: ");
        String floor=input.nextLine();
        while(floor==null||!floor.matches("^[1-9]([0-9]+)*"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the floor (more than zero: ");
            floor=input.nextLine();
        }


        System.out.println("Enter pool area of villa: ");
        String pool=input.nextLine();
        while(pool==null||!pool.matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter pool area of villa: ");
            pool=input.nextLine();
        }
        while(Double.parseDouble(pool)<=30)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter pool area of villa: ");
            pool=input.nextLine();
        }



        Villa villa=new Villa(name,usableArea,rentExpense,max,type,standard,pool,floor);
        facilityVilla.put(villa,0);

        System.out.println("Add new villa successful!");
    }

    @Override
    public void addHouse() {
        System.out.println("Enter name of house: ");
        String name=input.nextLine();
        while(!name.matches("[S][V][H][O][-][0-9]{4}"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter name of house: ");
            name=input.nextLine();
        }
        System.out.println("Enter usable area (More than 30 m2): ");
        String usableArea=input.nextLine();
        while(usableArea==null||!usableArea.matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }
        while(Double.parseDouble(usableArea)<=30)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }





        System.out.println("Enter rent expense (More than zero): ");
        String rentExpense=input.nextLine();
        while(rentExpense==null||!rentExpense.matches("^\\d*[1-9]\\d*$"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter rent expense: ");
            rentExpense=input.nextLine();
        }





        System.out.println("Enter the maximum capacity (no more than 20)");
        String max=input.nextLine();
        while(max==null||!max.matches("[012]{0,1}+[0-9]"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }
        while(Integer.parseInt(max)>20||Integer.parseInt(max)<0  )
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }




        System.out.println("Enter the type of rent (Month, Day, Year, Week): ");
        String type=input.nextLine();
        String typeOfRent="Month Day Year Week";
        while(type==null||!typeOfRent.contains(type))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the type of rent: ");
            type=input.nextLine();
        }



        System.out.println("Enter standard of villa (Vip,Standard, Member):");
        String standardOfVilla="Vip Standard Member";
        String standard=input.nextLine();
        while(standard==null||!standardOfVilla.contains(standard))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter standard of house (Vip,Standard, Member):");
            standard=input.nextLine();
        }

        System.out.println("Enter the floor (more than zero): ");
        String floor=input.nextLine();
        while(floor==null||!floor.matches("^[1-9]([0-9]+)*"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the floor (more than zero): ");
            floor=input.nextLine();
        }
        House house=new House(name,usableArea,rentExpense,max,type,standard,floor);
        facilityHouse.put(house,0);
        writeHouse(fileHouse,facilityHouse);
        System.out.println("Add new house successful!");
    }

    @Override
    public void addRoom() {
        System.out.println("Enter name of room: ");
        String name=input.nextLine();
        while(!name.matches("[S][V][R][O][-][0-9]{4}"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter name of room: ");
            name=input.nextLine();
        }


        System.out.println("Enter usable area (More than 30 m2): ");
        String usableArea=input.nextLine();
        while(usableArea==null||!usableArea.matches("([0-9]+\\.[0-9]*)|([0-9]*\\.[0-9]+)|([0-9]+)"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }
        while(Double.parseDouble(usableArea)<=30)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area: ");
            usableArea=input.nextLine();
        }


        System.out.println("Enter rent expense (More than zero): ");
        String rentExpense=input.nextLine();
        while(rentExpense==null
                ||!rentExpense.matches("[0-9]*"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter rent expense: ");
            rentExpense=input.nextLine();
        }


        System.out.println("Enter the maximum capacity (no more than 20)");
        String max=input.nextLine();
        while(max==null||!max.matches("[012]{0,1}+[0-9]"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }
        while(Integer.parseInt(max)>20||Integer.parseInt(max)<0  )
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity");
            max=input.nextLine();
        }



        System.out.println("Enter the type of rent (Month, Day, Year, Week): ");
        String type=input.nextLine();
        String typeOfRent="Month Day Year Week";
        while(type==null||!typeOfRent.contains(type))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the type of rent: ");
            type=input.nextLine();
        }



        System.out.println("Enter the type of free service");
        String free=input.nextLine();
        while(free==null||!free.matches("^[A-Z]+[A-Z a-z]+"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the type of free service");
            free=input.nextLine();
        }



        Room room=new Room(name,usableArea,rentExpense,max,type,free);
        facilityRoom.put(room,0);
        System.out.println("Add new room successful!");
    }

    @Override
    public void displayMaintenance() {
        for(Map.Entry<Facility,Integer>element:facilityHouse.entrySet())
        {
            System.out.println("Service "+element.getKey()+", Number of used:"+element.getValue());
        }
        for(Map.Entry<Facility,Integer>element:facilityVilla.entrySet())
        {
            System.out.println("Service "+element.getKey()+", Number of used:"+element.getValue());
        }
        for(Map.Entry<Facility,Integer>element:facilityRoom.entrySet())
        {
            System.out.println("Service "+element.getKey()+", Number of used:"+element.getValue());
        }
    }



    public static void writeHouse(String filePath, Map<Facility,Integer>facilityHouse) {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> element : facilityHouse.entrySet()) {

                bw.write(element.getKey().getNameService() + ", " +
                        element.getKey().getUsableArea() + ", " +
                        element.getKey().getRentExpense() + ", " +
                        element.getKey().getMaxPeopleInFalicity() + ", " +
                        element.getKey().getTypeOfRent() + ", " +
                        ((House) element.getKey()).getStandard() + ", " +
                        ((House) element.getKey()).getNumberOfFloor() + ", Number of used: " +
                        element.getValue() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeVilla(String filePath, Map<Facility,Integer>facilityVilla) {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> element : facilityVilla.entrySet()) {

                bw.write(element.getKey().getNameService() + ", " +
                        element.getKey().getUsableArea() + ", " +
                        element.getKey().getRentExpense() + ", " +
                        element.getKey().getMaxPeopleInFalicity() + ", " +
                        element.getKey().getTypeOfRent() + ", " +
                        ((Villa) element.getKey()).getStandard() + ", " +
                        ((Villa) element.getKey()).getNumberoffloor() + ", " +
                        ((Villa) element.getKey()).getPoolarea() + ", Number of used: " +
                        element.getValue() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
