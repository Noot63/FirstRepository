package HW16;

import java.util.Arrays;

public class Box {
    public int index;

    Box[] boxs = new Box[3];
    int[] box1 = {1,2,3};
    public int findAll(Box index) {
        this.boxs[0] = index;
        box1 = Arrays.copyOf(box1,box1.length + 3);
        return 1;
    }
}
