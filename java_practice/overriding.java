class A{
 void process(){
 System.out.println("hello");
}
}
class B extends A{
void process(){
 System.out.println("my name");
}
}

public class overriding {
 public static void main(String [] args){
  A obj=new A();
  B obj2=new B();

    A ref;
 ref=obj2;
 ref.process();
}
}
