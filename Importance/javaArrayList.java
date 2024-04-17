import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class javaArrayList {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<Integer>();
    list.add(11);
    list.add(1);
    Collections.sort(list);
    System.out.println(list);
    }
}
