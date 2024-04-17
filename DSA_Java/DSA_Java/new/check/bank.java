package check;
public class bank {
 String name;
double balence;
public bank (String name,double balence){
this.name=name;
this.balence=balence;

}
 public void check(){
 if(balence<0){
 System.out.println("The balence " + balence+ " is less than 0" );

}else{
 System.out.println("The balence " + balence+ " is greater than 0" );
}
}
}