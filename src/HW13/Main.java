package HW13;

public class Main {
    public static void main(String[] args) {
        General<Integer> general0 = new General<Integer>(1);
        General<String> general1 = new General<>("one");
        General<Double> general2 = new General<>(2.0);
        General<Boolean> general3 = new General<>(true);
        General<Object> entArrays = new General<>(new Lecture(2, "two"));
        entArrays.arrays = new Object[7];
        entArrays.arrays[0] = new Teacher(1, "teacher Mr. Smith");
        entArrays.arrays[1] = new Lecture(3, "lecture Methods");
        entArrays.arrays[2] = new Lecture(4, "lecture Constructor");
        entArrays.arrays[3] = new Lecture(5, "lecture Generics");
        entArrays.arrays[4] = new Student(1, "student Alex");
        entArrays.arrays[5] = new Student(2, "student Rob");

        General<Student> entityArrays = new General<>(new Student(1, "Bob"));
        entityArrays.arrays = new Student[3];
        entityArrays.arrays[1] = new Student(3, "Ivan");
        entityArrays.arrays[2] = new Student(4, "Agneshka");

        for (int i = 0; i < entArrays.arrays.length; i++) {
            System.out.println(entArrays.arrays[i]);
        }
        for (int i = 0; i < entityArrays.arrays.length; i++) {
            System.out.println(entityArrays.arrays[i]);
        }

        System.out.println(entArrays.arrays.length);

        System.out.println(entArrays.isEmpty());

        System.out.println(entArrays.get(2));

        entArrays.add("Student");

    }
}


