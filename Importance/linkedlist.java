import java.util.LinkedList;

public class linkedlist {
    static LinkedList<Integer> arr[];
    static void Linkedlist1(int vertices){
     arr=new LinkedList[vertices];
   for(int i=0;i<vertices;i++){
    arr[i]=new LinkedList<Integer>();
   }
  }

  static void Linkedlist2(int s,int d){
    arr[s].add(d);
    arr[d].add(s);
 arr.get(0);

  }
    
  public static void main(String args[]){
   int v=3;
    int  source=1;
    int destination=2;
     Linkedlist1(v);
        Linkedlist2(source,destination);
    }
}