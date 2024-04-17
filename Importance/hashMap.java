import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashMap {
    public static void main(String[] args) {
        HashMap <String,Integer>map=new HashMap<>();
        map.put("India",12);
              map.put("Indi",12);
                    map.put("Ind",12);
       int data= map.get("India");
       System.out.println(data);



       for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey ());
       }
       Set<String> obj= map.keySet();
       for(String str: obj){
        System.out.println(str);
       }
       }
    }
