package sourceJava.methodDisplathDynamically;

 class first{
    public void show(){
        System.out.println("i am in  class first");
    }
}
    class second extends first{
        public void show(){
            System.out.println("I am in class second");
        }
    }
    class third extends first{
        public void show(){
            System.out.println(" I am in  class third");
        }
    }


    public class sourceCode {
    public static void main(String[] args) {
        first ob1=new first();
       second ob2=new second();
        third ob3=new third();
        ob1.show();
        first r;
        r=ob1;
        r.show();
       r=ob3;
       r.show();
       r=ob2;
       r.show();
    }
} 