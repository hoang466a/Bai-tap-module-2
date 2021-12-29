package FuramaResort.models.falicity;

public class Villa extends Facility{
    private String standard;
    private double poolarea;
    private int numberoffloor;

    public Villa(){};

    public Villa(String standard, double poolarea, int numberoffloor) {
        this.standard = standard;
        this.poolarea = poolarea;
        this.numberoffloor = numberoffloor;
    }

    public Villa(String nameservice, double usablearea, int rentexpense, int maxpeopleinfalicity, String typeofrent, String standard, double poolarea, int numberoffloor) {
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

    public double getPoolarea() {
        return poolarea;
    }

    public void setPoolarea(double poolarea) {
        this.poolarea = poolarea;
    }

    public int getNumberoffloor() {
        return numberoffloor;
    }

    public void setNumberoffloor(int numberoffloor) {
        this.numberoffloor = numberoffloor;
    }
}
