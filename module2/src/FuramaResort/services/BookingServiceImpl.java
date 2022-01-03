package FuramaResort.services;

import FuramaResort.models.Booking;
import FuramaResort.models.falicity.Facility;
import FuramaResort.models.person.Customer;
import FuramaResort.services.impl.BookingService;
import FuramaResort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static String fileBooking = "D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\booking.csv";
    public static String fileCustomer = "D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\customer.csv";
    public static String fileHouse = "D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\house.csv";
    public static String fileRoom = "D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\room.csv";
    public static String fileVilla = "D:\\Codegym\\Module02\\module2\\src\\FuramaResort\\data\\villa.csv";
    public static Scanner in=new Scanner(System.in);
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    public static Map<Facility, Integer> facilityHouse = new LinkedHashMap<>();
    public static Map<Facility, Integer> facilityVilla = new LinkedHashMap<>();
    public static Map<Facility, Integer> facilityRoom = new LinkedHashMap<>();

    static {
        customerList = customerService.readFile(fileCustomer);
        facilityHouse=facilityService.readHouse(fileHouse);
        facilityRoom=facilityService.readRoom(fileRoom);
        facilityVilla=facilityService.readVilla(fileVilla);
        facilityIntegerMap.putAll(facilityRoom);
        facilityIntegerMap.putAll(facilityHouse);
        facilityIntegerMap.putAll(facilityVilla);
    }


    @Override
    public void display() {

    }

    @Override
    public void add() {
        int id=1;
        if(!bookingSet.isEmpty()){
            id=bookingSet.size();
        }
    }


    public static Customer chooseCustomer(){
        System.out.println("List of customers");
        for (Customer customer:customerList)
        {
            System.out.println(customer);
        }

        System.out.println("Enter id of customer");
        boolean check=true;
        String id=in.nextLine();

        while(check){
            for (Customer customer:customerList)
            {
                if(id.equals(customer.getId())){
                    check=false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Id has not found!");
                System.out.println("Enter id of customer");
                id=in.nextLine();
            }
        }
    return null;
    }


    public static Facility chooseFacility(){
        System.out.println("List of facility");
        for (Map.Entry<Facility,Integer>entry:facilityVilla.entrySet())
        {
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Enter id of facility");
        boolean check=true;
        String id=in.nextLine();

        while(check){
            for (Map.Entry<Facility,Integer>entry:facilityVilla.entrySet())
            {
                if(id.equals(entry.getKey().getNameService())){
                    check=false;
                    return entry.getKey();
                }
            }
            if(check){
                System.out.println("Id has not found!");
                System.out.println("Enter id of facility");
                id=in.nextLine();
            }
        }
        return null;
    }

}
