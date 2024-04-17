
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class LinkedlistProcess{
  
   public Node insert(Node head,int value){
    Node ptr=head;
    
    if(head==null){
       return head=new Node(value);
    }else{
    // ptr=head;
    // while(ptr.next!=null){
    //     ptr=ptr.next;
    // }
    // ptr.next=new Node(value);
   
     if(ptr.next!=null){
       ptr= insert(ptr.next,value);
     }
     ptr.next=new Node(value);
    }
    return head;
   } 
   public void printAll(Node head){
    Node currNode=head;
   while(currNode!=null){
    System.out.println(currNode.val);
   currNode= currNode.next;
   }
   }
}
public class sample {

    public static void main(String[] args) {
        Node head=null;
       LinkedlistProcess sent=new LinkedlistProcess();
    head= sent.insert(head,10);
      head=  sent.insert(head,11);
       head=  sent.insert(head,12);
       sent.printAll(head);
    }
}
