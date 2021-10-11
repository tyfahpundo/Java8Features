import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stud {
    String name;
    int marks;

    public Stud(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
class StudeTest{
    public static void main(String[] args) {
        ArrayList<Stud> studList = new ArrayList<>();
        populate(studList);
        Predicate<Stud> p = s-> s.marks>=60;
        Function<Stud,String> f = s ->{
                int marks = s.marks;
                if(marks>80){
                    return "A [Distinction]";
                }
                else if(marks>70){
                    return "B [First Class]";
                }else if(marks>60){
                    return "C [Second Class]";
                }else if(marks>50){
                    return "D [Pass]";
                }else{
                    return "F [Failed]";
                }
        };
        Consumer<Stud> c = s ->{
            System.out.println("Student Name: "+ s.name);
            System.out.println("Student Marks: "+s.marks);
            System.out.println("Student Grade: "+ f.apply(s));
            System.out.println();
        };
        for(Stud student: studList){
            if(p.test(student)){
                c.accept(student);
            }
        }
    }

    private static void populate(ArrayList<Stud> studList) {
        studList.add(new Stud("Tyfah",78));
        studList.add(new Stud("Rodney",89));
        studList.add(new Stud("Zawala",56));
        studList.add(new Stud("Chiremba",28));
        studList.add(new Stud("Allons",67));
        studList.add(new Stud("Meki",68));
    }
}
