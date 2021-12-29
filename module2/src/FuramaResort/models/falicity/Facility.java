package FuramaResort.models.falicity;

    public abstract class  Facility {
    private String nameService;
    private double usableArea;
    private int rentExpense;
    private int maxPeopleInFalicity;
    private String typeOfRent;


    public Facility(){};

    public Facility(String nameservice, double usablearea, int rentexpense, int maxpeopleinfalicity, String typeofrent) {
        this.nameService = nameservice;
        this.usableArea = usablearea;
        this.rentExpense = rentexpense;
        this.maxPeopleInFalicity = maxpeopleinfalicity;
        this.typeOfRent = typeofrent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentExpense() {
        return rentExpense;
    }

    public void setRentExpense(int rentExpense) {
        this.rentExpense = rentExpense;
    }

    public int getMaxPeopleInFalicity() {
        return maxPeopleInFalicity;
    }

    public void setMaxPeopleInFalicity(int maxPeopleInFalicity) {
        this.maxPeopleInFalicity = maxPeopleInFalicity;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public abstract String toString();
}
