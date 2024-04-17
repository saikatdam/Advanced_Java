//  package reverseLinkedlist;

import java.util.ArrayList;

// i have used Arraylist To do this Node traversal , But this approch is not a good approch

class revLinkedlist {
  static  Node head;
 static class Node{

 int data;
  Node next;

  public Node (int data){
   this.data=data;
    this.next=null;
  }
}

    public static Node dataStorage(int data){
      
        if(head==null){
    head=new Node(data);
   }else{
    Node temp=head;
     while(temp.next!=null){
        temp=temp.next;
     }
     
     temp.next=new Node(data);
   }
 return head;    
}

public static void printArray(Node Data){
//   for(int i=0;i<array.get(0).next!=null)
//  Node Data=array.get(0);

 while (Data!=null) {
    System.out.println(Data.data);
    Data=Data.next;
 }
}

public static Node revLinkedData(ArrayList<Node> array){
    // #1,2,3,4,5
 

   Node head=array.get(0);
   Node tempHead=head;
Node temp2Head=head.next;

while(temp2Head!=null){
   Node nextHead=temp2Head.next;
   temp2Head.next=tempHead;

   //updation process
     tempHead=temp2Head;
     temp2Head=nextHead;
}
head.next=null;
   head=tempHead;
   return head;
}
    public static void main(String args[]){
   
    ArrayList<Node> array=new ArrayList<>();
    Node storage=dataStorage(10);
    dataStorage(15);
    dataStorage(17);
    array.add(storage);
    System.out.println("The linkedlist Before reversing :-");
    printArray(array.get(0));
 System.out.println("The linkedlist After reversing :-");
   Node head= revLinkedData(array);
    printArray(head);
   
} 
    
}