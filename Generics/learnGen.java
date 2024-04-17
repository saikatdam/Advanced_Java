 class InnerlearnGen {
   public InnerlearnGen(){
     System.out.println("hello Miss");
}
 }


 interface InnerlearnGen_2 {

   public void rintMethod();
}

 class InnerlearnGen_1 extends InnerlearnGen {
  public int dataPass(int data){
    return data*11;
  }
    
 }
public class learnGen <T extends InnerlearnGen>   {
    InnerlearnGen_1 innGen;
    public learnGen(){
        int data=new InnerlearnGen_1().dataPass(11);
  System.out.println(data);
}
    

public static void main(String[] args) {
     learnGen<InnerlearnGen_1> gen= new learnGen<InnerlearnGen_1>();

    
     
}
}