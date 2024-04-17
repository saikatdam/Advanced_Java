public class Linkedlist{
  Node head;
static class Node{
 int data;
 Node next;
 Node prev;
 Node(int data){
  this.data=data;
 this.next=null;
 this.prev=null;
}
}
 public static void  create(int data, Linkedlist list ){
   Node newnode=new Node(data);
 
 if(list.head==null){
   newnode.prev=null;
   list.head=newnode;
    
}
else{
 Node current=list.head;
 while(current.next!=null){
 current=current.next;
}
current.next=newnode;
current.prev=current;
 
}
}
 public static void display(Linkedlist list){
    Node fetch=list.head;

 System.out.println();
 
   
  while(fetch!=null){
  System.out.println("the value is "+ fetch.data);
   fetch=fetch.prev;
}
}
public static void main(String args[]){
 Linkedlist list=new Linkedlist();
  create(10,list);
create(11,list);
create(12,list);
display(list);
}
}