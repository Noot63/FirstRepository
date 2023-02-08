package HW12;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("Alex", "Smith", "0980000000", "MrSmith@gmail.com");
        System.out.println(person);
        Course course = new Course("QA","Java");
        System.out.println("course name " + course);
        System.out.println(Person.email.endsWith("com"));

        }

    }

