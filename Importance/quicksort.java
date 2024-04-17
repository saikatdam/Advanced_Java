public class quicksort {

static int partition(int arr[],int low,int high){
    int pivot=arr[low];int temp;
    int i=arr[low+1];
    int j=arr[high];
   do{
    while(pivot>=arr[i]){
        i++;
    }
    while(pivot<arr[j]){
        j--;
    }
    if(i<j){
          temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    
    }
}while(i<j);
      temp=arr[low];
     arr[low]=arr[j];
     arr[j]=temp;
     return j;

}

    static void quickSort(int arr[],int low,int high){
        int pivotIndex;
    while (low<high) {
        pivotIndex=partition(arr,low,high);
    quickSort(arr, low, pivotIndex);
    quickSort(arr, pivotIndex, high);
    }
}
    static void printArray(int arr[],int length){
        for(int i=0;i<length;i++){
         
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,1,5,6};
        
      int n=5;
      
        printArray(arr,n);
        quickSort(arr,0,n-1);
        printArray(arr,n);
    }
}
