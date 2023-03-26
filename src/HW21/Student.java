package HW21;

class Student extends Thread {

    private int id;
    private Task task;
    private int finishTime;
    private boolean finished;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Студент " + id + " отримав завдання номер " + task.getId());
        try {
            Thread.sleep(task.getExecutionTime() * 1000);
            finishTime = task.getExecutionTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}