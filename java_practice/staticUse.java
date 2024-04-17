public class staticUse {
static void process(int min ,int max){
 int count=1;  
for(int i=min;i<=max;i++){
 int  j=2;  
 count=1;
  while(j<i){
   if(i%j==0){
    count--;
    break;
   }
else{
  j++;
}
}
  if(count==1)
System.out.println(i + " is a prime Number");
}
}
 public static void main(String [] args){
 process(1,200);
}
}