public class recursiveFunc {
    static int sum=0;
    public static int funcValue(int val){
        if(val<0){
            return sum;
        }

       return funcValue(val-1);
        sum+=val;

    }
    public static void main(String args[]){
        System.out.println(funcValue(5));
    }
}
