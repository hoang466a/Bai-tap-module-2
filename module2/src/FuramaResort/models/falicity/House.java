package FuramaResort.models.falicity;

public class House extends Facility{
    private String standard;
    private String numberoffloor;

    public House(){}


    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", numberoffloor='" + numberoffloor + '\'' +
                '}';
    }



    public House(String standard, String numberoffloor) {
        this.standard = standard;
        this.numberoffloor = numberoffloor;
    }

    public House(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent, String standard, String numberoffloor) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.standard = standard;
        this.numberoffloor = numberoffloor;
    }
}
