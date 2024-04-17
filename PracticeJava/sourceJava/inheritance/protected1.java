package sourceJava.inheritance;
class first{
 protected void first1(){
    System.out.println("i am first");
 }
}

class second extends first{
    void second1(){
        System.err.println(" i am second ");
    }
}
public class protected1 {
    public static void main(String args[]){
 second obj= new second();
 obj.first1();
    }
}
