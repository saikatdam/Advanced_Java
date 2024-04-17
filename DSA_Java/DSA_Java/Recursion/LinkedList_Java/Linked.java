public class Linked {
 Node head;

 static class Node{
 int val;
Node next;

  Node(int value){
   val=value;
    Node next=null;
}
 }

    public static Linked insert(Linked list, int data) 
    { 
     
        Node new_node = new Node(data); 
         
   
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
          
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
       
            last.next = new_node; 
        } 
   

        return list; 
    } 

public static Linked insertBeg(Linked list,int data){
       Node node = new Node(data); 
   
if(list.head==null){
    list.head=node;
}else{
  node.next=list.head;
   list.head=node;
}
 return list;
}
  public static Linked indexInsertion(Linked list,int value,int position){
   Node node = new Node(value); 
      Node tempp;
if(list.head==null){
    list.head=node;
}
  else{
 Node temp=list.head;
  
   for(int i=1;i<position-1;i++){   
temp=temp.next;
    
     
}
node.next=temp.next;
  temp.next=node;
}
 return list;
}

 public static void printList(Linked list) 
    { 
        Node currNode = list.head; 
    
        System.out.print("LinkedList: "); 
    

        while (currNode != null) { 
    
            System.out.print(currNode.val + " "); 
    
     
            currNode = currNode.next; 
        } 
    } 
    
 public static void main(String args[]){
  Linked list =new Linked();
  list=insert(list,1);
  list=insert(list,2);
  list=insert(list,3);
  list=insert(list,4);
  list=insertBeg(list,10);
 list=indexInsertion(list,20,4);
 printList(list);
}
}

