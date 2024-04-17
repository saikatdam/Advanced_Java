interface Anno{
 public void meth1();

}
class anonyDemo implements Anno{
 public void display(){
 System.out.println("Hello my name is saikat dam ");
}

@Override
public void meth1(){
 System.out.println(" i am meth1");
}
}

class sample{
public  static void main(String args[]){
 anonyDemo obj=new anonyDemo();
 obj.meth1();
}
}