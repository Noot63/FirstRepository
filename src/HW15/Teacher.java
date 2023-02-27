package HW15;

public class Teacher {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 8 / a;

            int array[] = {5, 2, 1};
            System.out.println(array[7]);


        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException :" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ex " + e);

            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.toString());
            }
        }

        System.out.println("Program is still running");

    }
}
