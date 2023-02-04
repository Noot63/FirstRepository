package Repository;


import com.academy.Course;
import com.academy.SuperClass;

class CourseRepository extends SuperRepository {
  private static Course[] courses = new Course[3];
  @Override
  protected void addEnt() {
    Course course = new Course("Java developer", 1);
    System.out.println("Amount of added entities is " + course.count);
  }


}







