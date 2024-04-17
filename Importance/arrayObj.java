public class arrayObj {
    public static void main(String args[]){
        int arr[]={1,8,3,6,5};int max=0;
        int data=0;

        for(int i=0;i<5-1;i++){
          if(arr[max]>arr[max+1]){
            max+=1;
          }

        }
        System.out.println(arr[max]);
    }
}
