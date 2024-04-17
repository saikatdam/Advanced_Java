package sourceJava.abstact;
abstract class abss{
    final int a=10;
int b=10;
void show(){
    System.out.println("hello  " + b);
}
     abstract String process(String msg);
}
class absss extends abss{
  
    String msg1;
     absss(String msg1){
        this.msg1=msg1;
      
        b=22;
        System.out.println("The values are " + a + b);
     }
        @Override
  String process(String msg){
       String str=msg; String str2=" hello ram prasaad";
    System.out.println(msg1);
  msg=str2;
        System.out.println(msg);
        System.out.println("the values are " + a +b);
     return str2;
    }
}


public class abs {
    public static void main(String args[]){
        absss ref=new absss("my name is lakhan");
    String str= ref.process("hello");
    System.out.println(str);
    }
}
