class first{
first(int height,int width,int a){
 System.out.println(a);
 
}
void work(){
  System.out.println("hello saikat");
}
}
class second extends first{
second(int height,int width,int a){ 
super(height,width,a);
  int length=height+width+a;
 System.out.println(length +" is the result");
}
 void work(){
  System.out.println("hello dam");
}

}
  


public class superKey{
 public static void main(String[] args){
  second obj2=new second(33,12,3);

  obj2.work();
 }
}