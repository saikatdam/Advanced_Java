public class samplee{
 public static void main(String args[]){
 try{

 int a[]={1};
 a[5]=56/0;
 
}catch(NumberFormatException e){
  System.out.print("hello");
}catch (ArrayIndexOutOfBoundsException e){
  System.out.print("my name is saikat");
}
 }
}