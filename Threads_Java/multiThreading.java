public class multiThreading implements Runnable {
 private int countThread=0;
  public multiThreading(int countThread){
  this.countThread=countThread; 
  }
public void run(){
 for(int i=0;i<=3;i++){
 System.out.println(" Value is = " + i + "   Thread number " + countThread);

 try{
   Thread.sleep(500);

}catch (InterruptedException e){

}
}
}

  public static void main(String args[]){
 for(int j=0;j<=3;j++){
multiThreading thread=new multiThreading(j);
   Thread thread1= new Thread(thread);
 try{  
 thread1.start();
   
thread1.join();
 }catch(InterruptedException e){

}
 }
}
}
