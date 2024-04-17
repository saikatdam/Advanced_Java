
import java.util.*; 
public class arrayList {

    public static void main(String args[]){
  ArrayList <Integer> obj =new ArrayList<>();
 obj.add(40);
 obj.add(33);
  obj.add(60);
   obj.add(50); 
   System.out.println("the values are " + obj);
   obj.add(1,66);
   System.out.println("the values are " + obj);
    //linkedlist RepresentationS
LinkedList <Integer> obj= new LinkedList<> ();
 obj.addFirst(55);
obj.remove(0);
obj.add(77);
System.out.println(obj);
    }
}
