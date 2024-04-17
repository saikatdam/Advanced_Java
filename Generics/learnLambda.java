

public class learnLambda {
  @FunctionalInterface
    interface InnerlearnGen_2 {
   
      public void printMethod(String str);
   }
 
   public static void convertionSource(InnerlearnGen_2 inner){
     inner.printMethod("My name is Saikat");
   }
public static void main(String[] args) {
    

    convertionSource((printValue)->System.out.println("Hey " + printValue));
}}
