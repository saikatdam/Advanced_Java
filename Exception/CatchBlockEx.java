
 public class CatchBlockEx  {  
  
 public static void main(String[] args) {  
          
 try{    
  int a[]=new int[2];    
 a[5]=30/5;
  }    
  catch(ArithmeticException e)  
     {  
      System.out.println("Arithmetic Exception occurs");  
   }    
 catch(ArrayIndexOutOfBoundsException e)  
  {  
 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
 }    
catch(Exception e)  
{  
 System.out.println("Parent Exception occurs");  
 }                
}  
}  
