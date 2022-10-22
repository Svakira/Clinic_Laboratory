package model;

public class Patient {
    private String name;
    private String age;
    private String id;
    private String genre;
    private String telephone;

    private int pregnant;
    private int elderly;
    private int illness;

    public Patient(String name, String age, String id, String genre, String telephone, int pregnant, int elderly, int illness) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.genre = genre;
        this.telephone = telephone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public int getPregnant() {
        return pregnant;
    }

    public void setPregnant(int pregnant) {
        this.pregnant = pregnant;
    }

    public int getElderly() {
        return elderly;
    }

    public void setElderly(int elderly) {
        this.elderly = elderly;
    }

    public int getIllness() {
        return illness;
    }

    public void setIllness(int illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return  name  +
                "," + age  +
                "," + id  +
                "," + genre  +
                "," + telephone +
                "," +
                "\n";
    }
}