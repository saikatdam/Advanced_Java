import java.io.InputStreamReader;

class first implements Runnable{
    int n;
    first(int n){
        this.n=n;
    }
   public void run(){
   synchronized(this){
    for(int i=0;i<n;i++){
   System.out.println(" i am number " + i + " Member of " + Thread.currentThread().getName());

    }
      this.notify();
}
  
}

}
public class waitUse {

    
 public static void main(String args[]) {
  first obj=new first(4);
  Thread th=new Thread(obj);
 
    Thread thh=new Thread(obj);
  th.start();
    thh.start();

    try{
    thh.wait();
      
   }catch(InterruptedException e){
    
   }
 }   
}
