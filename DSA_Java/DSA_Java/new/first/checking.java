package first;
public class checking{
 String name;
double balance;
public void balance (String name,double balance){
this.name=name;
this.balance=balance;

}
 public void check(){
 if(balance<0){
 System.out.println("The balance " + balance+ " is less than 0" );

}else{
 System.out.println("The balance " + balance+ " is greater than 0" );
}
}
}