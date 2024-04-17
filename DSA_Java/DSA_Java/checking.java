class work1{
    String name;
    int value;
    work1(String str,int value){
  System.out.println("yoo");
        this.name=str;
this.value=value;
    }
  void info(){
System.out.println("good night");
  }
    }
class work2 extends work1{
    work2(String name,int value){
        super(name,value);
       
    }
}

public class checking {
    public static void main(String args[]){
        work2 obj=new work2("saikat",12);

    }
}