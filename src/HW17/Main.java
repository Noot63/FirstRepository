package HW17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final List<AdditionalMaterials> lectureList = new ArrayList<>();
        AdditionalMaterials additionalMaterials = new  AdditionalMaterials(1,"First",1,ResourceType.URL);
        AdditionalMaterials additionalMaterials2 = new  AdditionalMaterials(2,"Second",2,ResourceType.BOOK);
        AdditionalMaterials additionalMaterials3 = new  AdditionalMaterials(3,"Third",3,ResourceType.VIDEO);

        Scanner scanner = new Scanner(System.in);
        int genre = 0;

        do {
            System.out.println("Select genre");
            System.out.println("1." + additionalMaterials.getResourceType());
            System.out.println("2." + additionalMaterials2.getResourceType());
            System.out.println("3." + additionalMaterials3.getResourceType());
            System.out.println("4.Exit");
            genre = scanner.nextInt();

            if (genre > 4) {
                System.out.println("please input correct");
                continue;
            }

            switch (genre) {
                case 1:
                    System.out.println(additionalMaterials.getName());
                    break;
                case 2:
                    System.out.println(additionalMaterials2.getName());
                    break;
                case 3:
                    System.out.println(additionalMaterials3.getName());
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }

        } while (true);


    }


}

