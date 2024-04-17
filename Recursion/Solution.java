public class Solution {
    public static void searchRange(int[] nums, int target) {
       
        if(nums.length<0 || nums==null)
        return;
      
     System.out.println(checkingProcess(nums,0,nums.length,target));   
    }

    public static int[] checkingProcess(int nums[],int starting,int ending,int target){
         int arr[]=new int[2];
                boolean bool[]=new boolean[nums.length];
                int count=0;
        int mid=(starting+ending)/2;
         while(nums.length!=-1 || nums.length!=nums.length){
        if(target>nums[mid]){
          return checkingProcess( nums,mid+1,ending,target);
        }
        else if(target<nums[mid]){
          return checkingProcess( nums,starting,mid-1,target);
        }
        if(target==nums[mid]){
           if(bool[mid]!=true){
            arr[count++]=mid;
            bool[mid]=true;
        }
    }


    
    else{
       arr[0]=-1;
        arr[1]=-1;
       
    }

    }
    return arr;
}

public static void main(String[] args) {
    int nums[]={1,2,3,4,5,6};
    int target=4;
 System.out.println(nums);
searchRange( nums,target);
}
}
