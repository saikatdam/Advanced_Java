import java.util.ArrayList;

public class integerMaxMinCheck{
    public static void main(String[] args) {
        // int value= -2147483648;
        // char ch='5';
        // System.out.println(10+ch);
        // char [] collectionOfChar=new char[10];
    //     String ch="1";
    //     int data=0;
    //      char[] chPro=ch.toCharArray();
    // //   System.out.println(chPro);
    // for(int i=0;i<chPro.length;i++){
    //     System.out.println(chPro[i]);
    //     data=data*10 +chPro[i]-'0';
    // }
    // System.out.println(data);
// String str="g";
// String str2="ff";
//     int result=str.compareTo(str2);
//   System.out.println(result);
   ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Bob");

        // Add a new element at index 3
        names.set(2, "Alice");

        // Print the ArrayList
        for (String name : names) {
            System.out.println(name);
        }
    }
}