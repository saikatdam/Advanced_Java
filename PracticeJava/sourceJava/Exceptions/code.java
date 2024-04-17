package sourceJava.Exceptions;


    class A{
        public void show(){
            System.out.println("i am in  class A");
        }
    }
        class B extends A{
            public void show(){
                System.out.println("I am in class B");
            }
        }
        class C extends A{
            public void show(){
                System.out.println(" I am in  class C");
            }
        }
    
    
      public class code {
        public static void main(String[] args) {
            A ob1=new A();
           B ob2=new B();
            C ob3=new C();
            ob1.show();
            ob2.show();
        }
    }
    
