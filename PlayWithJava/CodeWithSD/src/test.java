import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student> {
    String name="";
    int roll;

     Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }



    @Override
    public int compareTo(Student o1) {
        return o1.roll<this.roll ? 1 :-1;
    }

    @Override
   public  String toString(){
         return "name " + name + " and " + " roll is " + roll;
    }

}

public class test {
    public static void main(String args[]){
        Queue<Student> obj=new PriorityQueue<>();

        obj.add(new Student("saikat",11));
        obj.add(new Student("saikat",10));
        obj.add(new Student("saikat",12));
       System.out.println(obj);

    }
}
