

public class shellSort {

    public static void shellsort(int arr[]){
    int length=arr.length;
     for(int gap=length/2;gap>0;gap/=2){
for(int j=gap;j<length;j++){
   int temp=arr[j];
  int i=0;
  for(i=j; i>=gap && arr[i-gap]>temp;i-=gap){
 arr[i]=arr[i-gap];
 }

  arr[i]=temp;
  }
}
     


    }
    
    public static void main(String args[]){
        int arr[]={2,5,1,2,4,6};
        shellsort(arr);
    }
}
