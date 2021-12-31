package FuramaResort.models.falicity;

    public abstract class  Facility {
    private String nameService;
    private String usableArea;
    private String rentExpense;
    private String maxPeopleInFalicity;
    private String typeOfRent;


    public Facility(){};

    public Facility(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent) {
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

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentExpense() {
        return rentExpense;
    }

    public void setRentExpense(String rentExpense) {
        this.rentExpense = rentExpense;
    }

    public String getMaxPeopleInFalicity() {
        return maxPeopleInFalicity;
    }

    public void setMaxPeopleInFalicity(String maxPeopleInFalicity) {
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
