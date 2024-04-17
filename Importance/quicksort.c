
#include<stdio.h>
 int partition(int arr[],int low,int high){
    
    int pivot=arr[low];int temp;
    int i=low+1;
    int j=high;
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

     void quickSort(int arr[],int low,int high){
        int pivotIndex;
   if(low<high){
        pivotIndex=partition(arr,low,high);
    quickSort(arr, low, pivotIndex-1);
    quickSort(arr, pivotIndex+1, high);
    }
}
     void printArray(int arr[],int length){
        for(int i=0;i<length;i++){
         
            printf("%d\n",arr[i]);
        }
    }
   int main(){
        int arr[]={3,2,1,5,6};
        int low=0;
      int n=5;
      
        printArray(arr,n);
        quickSort(arr,low,n-1);
        printArray(arr,n);
        return 0;
    }