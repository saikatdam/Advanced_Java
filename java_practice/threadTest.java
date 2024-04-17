 class myThread implements Runnable{
 int num;
  public myThread(int value){
    this.num=value;
  }
  @Override
       public void run(){
        try{
            System.out.println("Hello i am no " + num);
       Thread.sleep(2000);
        }catch(Exception e){
          System.out.println(e);
        }
    }
 
 }
public class threadTest {
   
    public static void main(String args[]){
        for(int i=1;i<=9;i++){
            myThread obj=new myThread(i);
            Thread th=new Thread(obj);
            // Thread th=new Thread(obj);
             th.start();
        }
    }
}
