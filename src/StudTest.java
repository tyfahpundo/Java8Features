import java.util.ArrayList;
import java.util.function.Function;

public class StudTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        populate(studentList);

        Function<Student,String> f = s->{
            int marks = s.score;
            if(marks>= 80){
                return "A[Distinction]";
            }
            else if(marks>=60){
                return "B[First Class]";
            }
            else if(marks >=45){
                return "C[Second Class]";
            }
            else{
                return "F[Failed Student]";
            }
        };
        for(Student s : studentList){
            System.out.println(s.name);
            System.out.println(s.score);
            System.out.println("Grade: "+f.apply(s));
            System.out.println("***********************************************************");
        }
    }

    private static void populate(ArrayList<Student> studentList) {
        studentList.add(new Student("Tafadzwa",100));
        studentList.add(new Student("Alex",65));
        studentList.add(new Student("Monalisa",74));
        studentList.add(new Student("Mason",55));
        studentList.add(new Student("Cleopatra",22));
        studentList.add(new Student("Sylvester",97));
        studentList.add(new Student("Brian",44));
    }
}
