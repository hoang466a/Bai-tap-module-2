package FuramaResort.models.falicity;

public class House extends Facility{
    private String standard;
    private int numberOfFloor;

    public House(){}


    @Override
    public String toString() {
        return "House{" +
                "name service='" + getNameService() + '\'' +
                ", usable area='" + getUsableArea() + '\'' +
                ", rent expense='" + getRentExpense() + '\'' +
                ", max people in room='" + getMaxPeopleInFalicity() + '\'' +
                ", type of rent ='" + getTypeOfRent() + '\'' +
                ", standard='" + standard + '\'' +
                ", number of floors='" + numberOfFloor + '\'' +
                '}';
    }



    public House(String standard, int numberoffloor) {
        this.standard = standard;
        this.numberOfFloor = numberoffloor;
    }

    public House(String nameservice, double usablearea, int rentexpense, int maxpeopleinfalicity, String typeofrent, String standard, int numberoffloor) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.standard = standard;
        this.numberOfFloor = numberoffloor;
    }
}
