package sourceJava;
 
 
    class subClass{
   int a,b;
   subClass(int a,int b){
 
    this.a=a;
   this.b=b;
    }
}
  
 public class parentClass {
    public static void main(String args[]){
        subClass obj=new subClass(10,12);
    }
}
