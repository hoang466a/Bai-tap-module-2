package FuramaResort.services;

import FuramaResort.models.Booking;
import FuramaResort.models.falicity.Facility;
import FuramaResort.models.person.Customer;
import FuramaResort.services.impl.BookingService;
import FuramaResort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
static Set<Booking> bookingSet=new TreeSet<>(new BookingComparator());
static List<Customer> customerList=new ArrayList<>();
static Map <Facility,Integer> facilityIntegerMap=new LinkedHashMap<>();





    @Override
    public void display() {

    }

    @Override
    public void add() {

    }



}
