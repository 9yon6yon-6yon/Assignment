import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public Student(String name) {
        this.name = name;
        this.id = -1;
        this.cgpa = -1;
    }

}

public class Question5 {


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Wizard", 3, 3.88));
        list.add(new Student("Peter", 2, 3.5));
        list.add(new Student("Wanda", 41, 3.88));
        list.add(new Student("Yelena", 7, 3.75));
        list.add(new Student("Thor", 15, 3.89));


        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                double d1 = student.cgpa;
                double d2 = t1.cgpa;
                if (d1 < d2) return 1;
                else if (d2 < d1) return -1;
                return 0;
            }
        });
        for (Student in : list
        ) {
            if(in.name.contains("Peter")){
                System.out.println("Peter was found");
            }
            System.out.println(in.name + " " + in.id + " " + in.cgpa);

        }
    }
}
