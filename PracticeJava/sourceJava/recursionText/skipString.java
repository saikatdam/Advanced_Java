public class skipString {
    public static String skip(String str){
        if(str.isEmpty()){
         
            return "" ;
        }
        
        // char ch=str.charAt(0);
        
        if(str.startsWith("Apple")){
          return  skip(str.substring(5));
        }else{
       
        return str.charAt(0)+ skip(str.substring(1));
        }
     
}
    public static void main(String args[]){
           System.out.println(skip("saiApplekat"));


}
}
