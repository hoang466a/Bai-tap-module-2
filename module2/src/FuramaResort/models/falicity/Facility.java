package FuramaResort.models.falicity;

public class Facility {
    private String nameservice;
    private String usablearea;
    private String rentexpense;
    private String maxpeopleinfalicity;
    private String typeofrent;


    public Facility(){};

    public Facility(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent) {
        this.nameservice = nameservice;
        this.usablearea = usablearea;
        this.rentexpense = rentexpense;
        this.maxpeopleinfalicity = maxpeopleinfalicity;
        this.typeofrent = typeofrent;
    }

    public String getNameservice() {
        return nameservice;
    }

    public void setNameservice(String nameservice) {
        this.nameservice = nameservice;
    }

    public String getUsablearea() {
        return usablearea;
    }

    public void setUsablearea(String usablearea) {
        this.usablearea = usablearea;
    }

    public String getRentexpense() {
        return rentexpense;
    }

    public void setRentexpense(String rentexpense) {
        this.rentexpense = rentexpense;
    }

    public String getMaxpeopleinfalicity() {
        return maxpeopleinfalicity;
    }

    public void setMaxpeopleinfalicity(String maxpeopleinfalicity) {
        this.maxpeopleinfalicity = maxpeopleinfalicity;
    }

    public String getTypeofrent() {
        return typeofrent;
    }

    public void setTypeofrent(String typeofrent) {
        this.typeofrent = typeofrent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameservice='" + nameservice + '\'' +
                ", usablearea='" + usablearea + '\'' +
                ", rentexpense='" + rentexpense + '\'' +
                ", maxpeopleinfalicity='" + maxpeopleinfalicity + '\'' +
                ", typeofrent='" + typeofrent + '\'' +
                '}';
    }
}
