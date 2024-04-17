package sourceJava.Deprecated;

class first{
   
   public void meth(){
        System.out.println("hey");
    }
     @Deprecated
 public void meth2(){
  System.out.println("yoo");
 }
}
public class sample {
    public static void main(String args[]){
  first obj= new first();
  obj.meth();
  obj.meth2();
    }
}
