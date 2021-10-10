import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Manage {
    public static void main(String[] args) {
        ArrayList<Worker> empList = new ArrayList<>();
        populate(empList);
        //All Managers information
        System.out.println("All Managers:");
        Predicate<Worker> p = emp->emp.designation.equals("Manager");
        display(p,empList);
        //All Harare Employees
        System.out.println("All Harare Employees");
        Predicate<Worker> p2 = emp->emp.city.equals("Harare");
        display(p2,empList);
        //Salary less than 20000
        System.out.println("Employees with Salaries < 20000");
        Predicate<Worker>p3 = emp->emp.salary<20000;
        display(p3,empList);
        //All Harare Managers predicate chaining
        System.out.println("All Harare Managers:");
        display(p.and(p2), empList);

//        System.out.println(empList);
    }
    public static void populate(ArrayList<Worker> list){
        list.add(new Worker("Tafadzwa","CEO",30000,"Harare"));
        list.add(new Worker("Blessing","LEAD",45000,"Masvingo"));
        list.add(new Worker("Monalisa","Manager",15000,"BeightBridge"));
        list.add(new Worker("Tom","Manager",14000,"Harare"));
        list.add(new Worker("Lingard","Manager",34000,"Harare"));
        list.add(new Worker("Shelton","Developer",50000,"Victoria Falls"));
        list.add(new Worker("Keith","Developer",47000,"Victoria Falls"));
        list.add(new Worker("Bonasi","Developer",200000,"Victoria Falls"));
        list.add(new Worker("Shawn","Manager",200000,"Harare"));
    }
    public static void display(Predicate<Worker> p, ArrayList<Worker> list){
        for( Worker emp: list){
            if(p.test(emp)){
                System.out.println(emp);
            }
        }
        System.out.println("*******************************************************************************");
    }
}
