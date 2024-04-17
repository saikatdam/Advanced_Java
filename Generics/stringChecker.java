public class stringChecker {
    public static void main(String[] args) {
        // String str="saikat";
        // String str2=str.app
    StringBuilder str= new StringBuilder("saikat"); 
    str.append("dam");
    System.out.println(str);
    str.replace(6,9, "roy");
    str.deleteCharAt(0);

    System.out.println(str);
   }
}
