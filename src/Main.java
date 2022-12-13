import Service.MainService;
import com.academy.Course;
import com.academy.Lecture;


public class Main {


    public static void main(String[] args) {
        Course course1 = new Course("1", "Математичні дії");

        Lecture lectureone = new Lecture("1","Додавання");
        Lecture lecturesecond = new Lecture(12,"Віднімання");
        Lecture lecturethird = new Lecture(3, "Ділення");
        Lecture lecturefource = new Lecture(4, "Множення");
        Lecture lecturefifse = new Lecture(5, "Відсотки" );
        Lecture lecturesix = new Lecture(6, "Корені");

        int category = MainService.choiceOfCategory(MainService.choiceone());
        MainService.choicetwo();

    }
}

