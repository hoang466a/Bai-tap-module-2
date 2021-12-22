package FuramaResort.models.falicity;

public class Room extends Facility{
    private String typeoffreeservice;

    public Room(String typeoffreeservice) {
        this.typeoffreeservice = typeoffreeservice;
    }

    public Room(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent, String typeoffreeservice) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.typeoffreeservice = typeoffreeservice;
    }

    public String getTypeoffreeservice() {
        return typeoffreeservice;
    }

    public void setTypeoffreeservice(String typeoffreeservice) {
        this.typeoffreeservice = typeoffreeservice;
    }
}
