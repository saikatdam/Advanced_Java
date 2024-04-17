
import java.lang.Exception;
public class throwEx{

    
static class WrongValueException extends Exception{
  WrongValueException(){
    super("You are not eligible");
   }
}
public  static void myException() throws WrongValueException{
  int a=17;
    if(a<=18){
          throw new WrongValueException();
       }else{
        System.out.println("You are Eligible");
       }
}

    public static void main(String args[])throws WrongValueException {
     
        myException();
      
      

}


}