package FuramaResort.services;

import FuramaResort.models.falicity.Facility;
import FuramaResort.models.falicity.House;
import FuramaResort.models.falicity.Room;
import FuramaResort.models.falicity.Villa;
import FuramaResort.services.impl.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static String filePath="D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\services\\impl\\FacilityService.java";
    public static Map<Facility,Integer> facilityIntegerMap=new LinkedHashMap<>();
    static{
        Facility villa2=new Villa("SVVL-1111",200,4000,19,"year","VIP",10.5,3);
        Facility house2=new House("SVHO-2222",100,1000,10,"day","STANDARD",2);
        Facility room2=new Room("SVRO-3333",35,500,4,"hour","123");
        Facility house3=new House("SVHO-3333",100,1000,10,"day","STANDARD",2);
        facilityIntegerMap.put(villa2,5);
        facilityIntegerMap.put(house2,2);
        facilityIntegerMap.put(room2,3);
        facilityIntegerMap.put(house3,5);
    }


    Scanner input=new Scanner(System.in);


    public void display(){
        for(Map.Entry<Facility,Integer>element:facilityIntegerMap.entrySet())
        {
            System.out.println("Service "+element.getKey());
        }
    }

    @Override
    public void addVilla() {
        System.out.println("Enter name of villa: ");
        String name=input.nextLine();
        while(!name.matches("[S][V][V][L][-][0-9]{4}"))
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter name of villa: ");
            name=input.nextLine();
        }




        System.out.println("Enter usable area of villa: ");
        double usableArea=Double.parseDouble(input.nextLine());
        System.out.println("Enter rent expense of villa: ");
        int rentExpense=Integer.parseInt(input.nextLine());
        System.out.println("Enter the maximum capacity of villa");
        int max=Integer.parseInt(input.nextLine());
        System.out.println("Enter the type of rent villa");
        String type=input.nextLine();
        System.out.println("Enter standard of villa");
        String standard=input.nextLine();
        System.out.println("Enter pool area of villa: ");
        double pool=Double.parseDouble(input.nextLine());
        System.out.println("Enter the floor of villa: ");
        int floor=Integer.parseInt(input.nextLine());
        Villa villa=new Villa(name,usableArea,rentExpense,max,type,standard,pool,floor);
        facilityIntegerMap.put(villa,0);
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
        System.out.println("Enter usable area of house: ");
        double usableArea=Double.parseDouble(input.nextLine());
        System.out.println("Enter rent expense of house: ");
        int rentExpense=Integer.parseInt(input.nextLine());
        System.out.println("Enter the maximum capacity of house");
        int max=Integer.parseInt(input.nextLine());
        System.out.println("Enter the type of rent house");
        String type=input.nextLine();
        System.out.println("Enter standard of house");
        String standard=input.nextLine();
        System.out.println("Enter the floor of house: ");
        int floor=Integer.parseInt(input.nextLine());
        House house=new House(name,usableArea,rentExpense,max,type,standard,floor);
        facilityIntegerMap.put(house,0);
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


        System.out.println("Enter usable area of room: ");
        String usableAreaString=input.nextLine();
        double usableArea=Double.parseDouble(usableAreaString);
        while(usableArea<30)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter usable area of room: ");
            usableArea=Double.parseDouble(input.nextLine());
        }


        System.out.println("Enter rent expense of room: ");
        int rentExpense=Integer.parseInt(input.nextLine());
        while(rentExpense<0)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter rent expense of room: ");
            rentExpense=Integer.parseInt(input.nextLine());
        }


        System.out.println("Enter the maximum capacity of room");
        int max=Integer.parseInt(input.nextLine());
        while(max>20||max<=0)
        {
            System.out.println("Input is wrong! Plaese re-enter: ");
            System.out.println("Enter the maximum capacity of room");
            max=Integer.parseInt(input.nextLine());
        }



        System.out.println("Enter the type of rent room");
        String type=input.nextLine();
        System.out.println("Enter the type of free service");
        String free=input.nextLine();

        Room room=new Room(name,usableArea,rentExpense,max,type,free);
        facilityIntegerMap.put(room,0);
        System.out.println("Add new room successful!");
    }


    @Override
    public void displayMaintenance() {
        for(Map.Entry<Facility,Integer>element:facilityIntegerMap.entrySet())
        {
            System.out.println("Service "+element.getKey()+", Number of used:"+element.getValue());
        }
    }

    ;
}
