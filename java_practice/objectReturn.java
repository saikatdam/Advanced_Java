class first{
    int a,b;
    first(int q,int e){
        this.a=q;
        this.b=e;
        // System.out.println("the values are " + a +" and " + b);
    }
}
class second{
 first change(int a,int b){
    first obj3=new first(a,b);
    return obj3;
 }
 
}

public class objectReturn{

    public static void main(String args[]){

       
        second obj2= new second();
      
        first obj4=new first(0,0);
        obj4= obj2.change(40,50);
        System.out.println("the value is " + obj4.a);
    }
}