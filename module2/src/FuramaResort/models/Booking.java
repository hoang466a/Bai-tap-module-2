package FuramaResort.models;

import FuramaResort.models.falicity.Facility;
import FuramaResort.models.person.Customer;

public class Booking {
    private int idBoooking;
    private String firstDay;
    private String lastDay;
    private Customer idCustomer;
    private Facility typeService;


    public Booking(){};

    public Booking(int idboooking, String firstday, String lastday, Customer idcustomer, Facility typeservice) {
        this.idBoooking = idboooking;
        this.firstDay = firstday;
        this.lastDay = lastday;
        this.idCustomer = idcustomer;
        this.typeService = typeservice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idboooking='" + idBoooking + '\'' +
                ", firstday='" + firstDay + '\'' +
                ", lastday='" + lastDay + '\'' +
                ", idcustomer='" + idCustomer + '\'' +
                ", typeservice='" + typeService + '\'' +
                '}';
    }

    public int getIdBoooking() {
        return idBoooking;
    }

    public void setIdBoooking(int idBoooking) {
        this.idBoooking = idBoooking;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Facility getTypeService() {
        return typeService;
    }

    public void setTypeService(Facility typeService) {
        this.typeService = typeService;
    }


}
