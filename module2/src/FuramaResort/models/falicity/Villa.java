package FuramaResort.models.falicity;

public class Villa extends Facility{
    private String standard;
    private String poolarea;
    private String numberoffloor;

    public Villa(){};

    public Villa(String standard, String poolarea, String numberoffloor) {
        this.standard = standard;
        this.poolarea = poolarea;
        this.numberoffloor = numberoffloor;
    }

    public Villa(String nameservice, String usablearea, String rentexpense, String maxpeopleinfalicity, String typeofrent, String standard, String poolarea, String numberoffloor) {
        super(nameservice, usablearea, rentexpense, maxpeopleinfalicity, typeofrent);
        this.standard = standard;
        this.poolarea = poolarea;
        this.numberoffloor = numberoffloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "name service='" + getNameService() + '\'' +
                ", usable area='" + getUsableArea() + '\'' +
                ", rent expense='" + getRentExpense() + '\'' +
                ", max people in room='" + getMaxPeopleInFalicity() + '\'' +
                ", type of rent ='" + getTypeOfRent() + '\'' +
                ", standard='" + standard + '\'' +
                ", poolarea='" + poolarea + '\'' +
                ", numberoffloor='" + numberoffloor + '\'' +
                '}';
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPoolarea() {
        return poolarea;
    }

    public void setPoolarea(String poolarea) {
        this.poolarea = poolarea;
    }

    public String getNumberoffloor() {
        return numberoffloor;
    }

    public void setNumberoffloor(String numberoffloor) {
        this.numberoffloor = numberoffloor;
    }
}
