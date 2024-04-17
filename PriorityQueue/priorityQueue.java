import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

   class Employee {
    int salary;
    String name;
    Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "The Salary is -> " + this.salary;
    }
}

class maintanace implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary-o2.salary;
    }
}
public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<Employee> addData=new PriorityQueue<>(10,new maintanace());
        addData.add(new Employee("sourav",2000));
        addData.add(new Employee("raj",2300));
        addData.add(new Employee("gaurav",3000));
        addData.add(new Employee("saikat",1000));
        System.out.println(addData);
    }
}
