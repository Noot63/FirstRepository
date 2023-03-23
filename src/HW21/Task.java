package HW21;

import java.util.Random;

class Task {

    private int id;
    private int executionTime;

    public Task(int id) {
        this.id = id;
        Random random = new Random();
        executionTime = random.nextInt(5) + 8;
    }

    public int getId() {
        return id;
    }

    public int getExecutionTime() {
        return executionTime;
    }

}