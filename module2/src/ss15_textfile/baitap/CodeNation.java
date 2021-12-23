package ss15_textfile.baitap;

public class CodeNation {
    private String id;
    private String codeNation;
    private String nation;


    public CodeNation(){};

    public CodeNation(String id, String codeNation, String nation) {
        this.id = id;
        this.codeNation = codeNation;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "CodeNation{" +
                "id='" + id + '\'' +
                ", codeNation='" + codeNation + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeNation() {
        return codeNation;
    }

    public void setCodeNation(String codeNation) {
        this.codeNation = codeNation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
