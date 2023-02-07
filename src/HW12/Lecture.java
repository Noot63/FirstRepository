package HW12;

public class Lecture {
    String name1 = "Introduction";
    String name2 = "Function";
    String description1 = "Intro";
    String description2 = "Topic";

    public Lecture(String name1, String name2, String description1, String description2) {
        this.name1 = name1;
        this.name2 = name2;
        this.description1 = description1;
        this.description2 = description2;
    }

    public Lecture() {
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                '}';
    }
}
