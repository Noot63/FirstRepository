package HW18;

import java.util.*;

public class AdditionalMaterials implements Comparable<AdditionalMaterials>{

    Double id;
    int lectureId;
    String type;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AdditionalMaterials(Double id, int lectureId, String type) {
        this.id = id;
        this.lectureId = lectureId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalMaterials that = (AdditionalMaterials) o;
        return id == that.id && lectureId == that.lectureId && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lectureId, type);
    }

    public static void main(String[] args) {

        AdditionalMaterials additMat1 = new AdditionalMaterials(1.1, 1, "Intoduction");
        AdditionalMaterials additMat2 = new AdditionalMaterials(2.1, 2, "Books");
        AdditionalMaterials additMat3 = new AdditionalMaterials(3.1, 3, "Must have");
        AdditionalMaterials additMat4 = new AdditionalMaterials(4.1, 4, "Link");
        AdditionalMaterials additMat5 = new AdditionalMaterials(5.1, 5, "Facts");
        List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();
        additionalMaterialsList.add(additMat1);
        additionalMaterialsList.add(additMat2);
        additionalMaterialsList.add(additMat3);
        additionalMaterialsList.add(additMat4);
        additionalMaterialsList.add(additMat5);
        System.out.println("List of additional materials before sorting: \n" + additionalMaterialsList);

        int a = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("To sort additional materials by id, input 1!");
            System.out.println("To sort additional materials by id (number) of the lecture, input 2!");
            System.out.println("To sort additional materials by resource type 3!");
            System.out.println("To exit - press 0!");

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    Collections.sort(additionalMaterialsList);
                    System.out.println("List of additional materials after sorting by id: \n" + additionalMaterialsList);
                    System.out.println("___________________");
                    break;
                case 2:
                    Collections.sort(additionalMaterialsList, new LectureIdComparator());
                    System.out.println("List of additional materials after sorting by lectureId: \n" + additionalMaterialsList);
                    System.out.println("___________________");
                    break;
                case 3:
                    Comparator resourceTypeComparator = Comparator.comparing(AdditionalMaterials::getType);
                    Collections.sort(additionalMaterialsList, resourceTypeComparator);
                    System.out.println("List of additional materials after sorting by resource type: \n" + additionalMaterialsList);
                    System.out.println("___________________");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number. Try again");
            }
        } while (a != 0);
    }

    @Override
    public int compareTo(AdditionalMaterials o) {
        return 0;
    }
}

