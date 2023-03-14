package HW16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        Collection<Integer> list = new ArrayList<>();
        Iterator<Integer> iter = list.iterator();
        Iter iters = new Iter(list.toArray(new Integer[7]), 5);
        Box boxs = new Box();

        System.out.println(iter.hasNext());
        System.out.println(iters.remove(3));
        System.out.println(iters.hasNext(1));
        System.out.println(boxs.findAll(boxs));
        System.out.println(iters.findAll(1, 2));

    }
}
