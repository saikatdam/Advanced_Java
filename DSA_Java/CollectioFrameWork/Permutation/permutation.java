
import java.util.List;
import java.util.ArrayList;

public class permutation {

    public static void main(String args[]){
  List<List<Integer>> result=new ArrayList<>();
   int[] arr={1,2,3,4};
  backTrakingFunc(result,new ArrayList<>(),arr,arr.length);
   Display(result);
    }
static void backTrakingFunc(List<List<Integer>> result,List<Integer>ListOfData,int arr[],int length)
{
  if(ListOfData.size()==arr.length){
    result.add(new ArrayList<>(ListOfData));
    return;
  }
  for(int data:arr){
    if(ListOfData.contains(data))
    continue;
  else{
    ListOfData.add(data);
  }
  backTrakingFunc(result, ListOfData, arr, length);
  ListOfData.remove(ListOfData.size()-1);
}
}

static void Display(List<List<Integer>> result){
    for(List<Integer> listOfData : result){
        for(int i : listOfData)
        System.out.print(i+ " ");
    System.out.println();
    }
}

}
