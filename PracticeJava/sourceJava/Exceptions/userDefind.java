package sourceJava.Exceptions;

class WrongValueException extends Exception {
    WrongValueException(String msg){
super(msg);
}
}
 
public  class userDefind{
public static void main(String args[]){
    int age=11;
try{
    if(age<18)
 throw new WrongValueException("you are not eligible to vote");
 else{
    System.out.println("you are eligible");
 }
}catch(WrongValueException e){
    e.printStackTrace();
}

}}


