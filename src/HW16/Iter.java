package HW16;

public class Iter<E> {
    private E[] current;
    private int index;

    public Iter(E[] current, int index) {
        this.current = current;
        this.index = index;
    }

    public boolean hasNext(int id) {
        E e = current[id];
        if (e != null) {
            return current[id + 1] != null;
        }
        return false;
    }

    public void iter () {
        for (int i = 0; i < current.length; i++) {
            final boolean b = hasNext(i);
            System.out.println(i + " " + b);
        }
    }
    public E remove(final int index) {
        for (int i = 0; i < current.length; i++) {
            return current[i];
        }
        return current[index + 1];
    }

    public E Next(final int index) {
        for (int i = 0; i < current.length; i++) {
            return current[i];
        }
        return current[index + 1];
    }

    public boolean findAll(int i, int i1) {
        return false;
    }
}
