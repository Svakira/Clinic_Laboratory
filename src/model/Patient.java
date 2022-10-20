package model;

public class Patient {
    private String name;
    private String age;
    private String id;
    private String genre;
    private String telephone;
    private boolean priority;

    public Patient(String name, String age, String id, String genre, String telephone, boolean priority) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.genre = genre;
        this.telephone = telephone;
        this.priority = priority;
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

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return  name  +
                "," + age  +
                "," + id  +
                "," + genre  +
                "," + telephone +
                "," + priority +
                "\n";
    }
}
