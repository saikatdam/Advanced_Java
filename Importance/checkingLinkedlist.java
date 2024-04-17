import java.util.ArrayList;
import java.util.LinkedList;
public class checkingLinkedlist {
    public static void main(String args[]){
        ArrayList<LinkedList<Integer>>obj1=new ArrayList<>();
    
        LinkedList <Integer> obj2=new LinkedList<>();
  obj2.add(11);
  obj2.add(12);
   obj1.add(obj2);
    int data=obj1.get(0).get(0);
    System.out.println(data);
    }
}
