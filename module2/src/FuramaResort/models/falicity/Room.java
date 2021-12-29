package FuramaResort.models.falicity;

public class Room extends Facility{
    private String typeOfFreeService;

    public Room(){}

    public Room(String typeoffreeservice) {
        this.typeOfFreeService = typeoffreeservice;
    }

    public Room(String nameservice, double usablearea, int rentexpense, int maxpeopleinfalicity, String typeofrent, String typeoffreeservice) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.typeOfFreeService = typeoffreeservice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name service='" + getNameService() + '\'' +
                ", usable area='" + getUsableArea() + '\'' +
                ", rent expense='" + getRentExpense() + '\'' +
                ", max people in room='" + getMaxPeopleInFalicity() + '\'' +
                ", type of rent ='" + getTypeOfRent() + '\'' +
                ", type of freeservice='" + typeOfFreeService + '\'' +
                '}';
    }

    public String getTypeOfFreeService() {
        return typeOfFreeService;
    }

    public void setTypeOfFreeService(String typeOfFreeService) {
        this.typeOfFreeService = typeOfFreeService;
    }
}
