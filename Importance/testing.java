public class testing{
    static int sum=0;

  public static int func1(int value){
   
         sum+=value;
         if(value==0)
         return sum;
return func1(value-1);
        }


    public static void main(String args[])
{
    int n=10;int sum=0;
   System.err.println(func1(n));
    }
}