class InvalidAgeException extends Exception{
 InvalidAgeException(String show){
   System.out.println(show);
}
}
public class customException{
 public static void main(String [] aegs){
  try{
 voting(16);
}catch(Exception e){
 System.out.println(e);
}
}
 public static void voting(int age)throws InvalidAgeException{
 if(age<=18){
 throw new InvalidAgeException("You are not eligible for Voting");

}else{
    System.out.println("you are eligible for Voting");
}
}
}