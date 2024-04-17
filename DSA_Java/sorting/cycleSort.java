

public class cycleSort {

    static void cyclesort(int arr[]){
      int  i=0;
      int length=arr.length;
        while(i<length){
            int current=arr[i]-1;
            if(arr[i]!=current){
                swap(arr,i,current);
            }
            i++;
               }
               for(int j=0;j<length;j++){
                System.out.println(arr[j]);
               }
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
  public static void main(String[] args) {
    int arr[]={4,2,1,3,5};
    cyclesort(arr);
  }
}
