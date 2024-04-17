class first{
public synchronized void work(String msg,int val){
    for(int i=0;i<3;i++){
     System.out.println("i am " + msg + val+ "\t"+"value->" +i);
    }
    try{
        Thread.sleep(1000);

    }
    catch(Exception e){
    System.out.println(e);
    }
    }
}
 

class myThread implements Runnable{
   first ob;String msg;int val;
   myThread(first ob,String msg,int val){
   this.ob=ob;
   this.msg=msg;
   this.val=val;
 }
  @Override
 public void run(){

ob.work(msg,val);
    
  }
}
public class sample{
    public static void main(String args[]){
   first obj=new first();

  
   for(int i=0;i<3;i++){
   synchronized(i){
    myThread ob=new myThread(obj,"Thread no " , i+1);
   Thread thread=new Thread(ob);
    thread.start();
    }
  }
  
}
}