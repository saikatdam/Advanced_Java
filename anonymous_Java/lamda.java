   @FunctionalInterface
interface demoInter{
  void meth();
 
 }
 
public class lamda
{
	public static void main(String[] args) {
     demoInter obj= ()->{
System.out.println("Hello my name is saikat dam ");
     };
obj.meth();
	}
}