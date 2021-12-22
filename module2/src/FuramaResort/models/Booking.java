package FuramaResort.models;

public class Booking {
    private String idboooking;
    private String firstday;
    private String lastday;
    private String idcustomer;
    private String nameservice;
    private String typeservice;


    public Booking(){};

    public Booking(String idboooking, String firstday, String lastday, String idcustomer, String nameservice, String typeservice) {
        this.idboooking = idboooking;
        this.firstday = firstday;
        this.lastday = lastday;
        this.idcustomer = idcustomer;
        this.nameservice = nameservice;
        this.typeservice = typeservice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idboooking='" + idboooking + '\'' +
                ", firstday='" + firstday + '\'' +
                ", lastday='" + lastday + '\'' +
                ", idcustomer='" + idcustomer + '\'' +
                ", nameservice='" + nameservice + '\'' +
                ", typeservice='" + typeservice + '\'' +
                '}';
    }

    public String getIdboooking() {
        return idboooking;
    }

    public void setIdboooking(String idboooking) {
        this.idboooking = idboooking;
    }

    public String getFirstday() {
        return firstday;
    }

    public void setFirstday(String firstday) {
        this.firstday = firstday;
    }

    public String getLastday() {
        return lastday;
    }

    public void setLastday(String lastday) {
        this.lastday = lastday;
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNameservice() {
        return nameservice;
    }

    public void setNameservice(String nameservice) {
        this.nameservice = nameservice;
    }

    public String getTypeservice() {
        return typeservice;
    }

    public void setTypeservice(String typeservice) {
        this.typeservice = typeservice;
    }


}
