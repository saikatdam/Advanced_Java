// package sourceJava.Exceptions;
class mainn{
    int b;
     void do1(int num){
        int b=num;
        this.b=b;
        System.out.println("the value from mainn class is "+ b);
    }
    }
public class staticMethod {
    
static int method1 (mainn obj){
   int a=11;
   int sum;
   obj.do1(10);
   sum=a+obj.b;

   return sum;
}
    public static void main(String args[]){
        mainn obj=new mainn();
   System.out.println("The value is " + method1(obj));
    }
}
