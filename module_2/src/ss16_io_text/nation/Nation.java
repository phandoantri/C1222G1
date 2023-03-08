package ss16_io_text.nation;

public class Nation {
    private String id;
    private String acronym;
    private String name;

    public Nation() {

    }

    public Nation(String id, String acronym, String name) {
        this.id = id;
        this.acronym = acronym;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id='" + id + '\'' +
                ", acronym='" + acronym + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
