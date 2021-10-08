import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    int eno;
    String name;

    Employee(int eno,String name){
        this.eno = eno;
        this.name = name;
    }
    public String toString(){
        return eno+": "+name;
    }
}
class Test1{
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"Allen"));
        list.add(new Employee(200,"Tafadza"));
        list.add(new Employee(145,"Tyfah"));
        list.add(new Employee(98,"Pundo"));
        System.out.println("Before sorting: "+list);
        Collections.sort(list,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        System.out.println("After sorting: "+list);
    }
}
