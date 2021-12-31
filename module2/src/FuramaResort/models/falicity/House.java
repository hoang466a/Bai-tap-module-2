package FuramaResort.models.falicity;

public class House extends Facility{
    private String standard;
    private String numberOfFloor;

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



    public House(String standard, String numberoffloor) {
        this.standard = standard;
        this.numberOfFloor = numberoffloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent, String standard, String numberoffloor) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.standard = standard;
        this.numberOfFloor = numberoffloor;
    }
}
