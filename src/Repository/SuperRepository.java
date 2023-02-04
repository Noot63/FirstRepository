package Repository;

import com.academy.SuperClass;

public class SuperRepository {
    static int count;
    public static SuperClass[] classes = new SuperClass[4];
    public SuperRepository(){
        count++;
    }

    public static SuperClass[] getClasses() {
        return classes;
    }
    public void getInfo(){
        for (int k = 0; k < classes.length; k++) {
            System.out.println("Index of array is " + k + "name is " + classes[k].getName() + "id is " + classes[k].getId());
        }
    }
    protected void addEnt() {
        SuperClass entity4 = new SuperClass();
        System.out.println("Amount of added entities is " + count);
    }
    protected void getById(int id) {
        for (int j = 0; j < classes.length; j++) {
            SuperClass entity4 = classes[j];
            if (classes[j].getId() == id) {
                System.out.println(entity4);
            }
        }
    }
    protected boolean deleteById(int id) {
        for (int l = 0; l < classes.length; l++) {
            if (classes[l].getId() == id) {
                classes[l] = null;
                return true;
            }
        }
        return false;
    }
}
