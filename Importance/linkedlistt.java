import java.util.ArrayList;
import java.util.LinkedList;
class Node{
    char data;
    Node(char Data){
        this.data=Data;
    }
}
class Graph{
     ArrayList<LinkedList<Node>> list;
     Graph(){
        list=new ArrayList<>();
     }
     public void addNode(Node node){
        LinkedList<Node> currentList=new LinkedList<>();
        currentList.add(node);
        list.add(currentList);
     }
     public void addEdge(int src,int des){
        // LinkedList<Node> currentList=list.get(src);
        
        Node dstNode=list.get(des).get(0);
        list.get(src).add(dstNode);

     }
     public boolean checkEdge(int src,int des)
     {
        LinkedList<Node> currentList=list.get(src);
        Node dstNode=list.get(des).get(0);

        for(Node node: currentList){
            if(node==dstNode){
                return true;
            }
        }
        return false;
     }
     public void print(){
        for(LinkedList <Node> currentList : list){
            for(Node node:currentList){
                System.out.print(node.data);
                
            }
            System.out.println();
}
     }
    }
   

   
public class linkedlistt {
    public static void main(String[] args) {
    Graph grh=new Graph();
   
    grh.addNode(new Node('a'));
    grh.addNode(new Node('b'));
    grh.addNode(new Node('c'));
    grh.addNode(new Node('d'));
    grh.addNode(new Node('e'));
  grh.addEdge(0,1);
   grh.addEdge(1,2);
      grh.addEdge(1,4);
         grh.addEdge(2,3);
           grh.addEdge(2,4);
             grh.addEdge(4,0);
               grh.addEdge(4,2);
               
          grh.print();
    }
}
