import java.util.HashSet;
import java.util.Iterator;
public  class sample{
 public static void main(String args[]){
HashSet <Integer> set= new HashSet <>();
 set.add(4);
 set.add(2);
 set .add(3); 
 set.add(4);
 set.add(5);

  
 if(set.contains(5)){
 System.out.println("Yes its contain the number :- 5 ");
}else{
 System.out.println("No its not containing any number related to 5");
}
 System.out.println(set);
 Iterator  it = set.iterator(); 
  while(it.hasNext()){
 System.out.println(it.next());
}
}
}