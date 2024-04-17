public class task1{
public static int method1(int data){
if(data==0)
return 0;
 return data+ method1(--data);

}
    public static void main(String[] args) {
System.out.println(method1(10));     
}
}