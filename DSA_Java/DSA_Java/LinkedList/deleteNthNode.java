

public class deleteNthNode {
    public static void main(String str[]){
      int nums1[]={1,2};
      int nums2[]={3,4};
        int length1=nums2.length;
        int length2=nums1.length;
      
       int length=length1+length2;
      
int nums3[]=new int[4];
int count=-1;
        for(int i =0;i<nums1.length;i++){
            count++;
                nums3[count]=nums1[i];
                
       
    }
    for(int j=0;j<nums2.length;j++){
        count++;
        nums3[count]=nums2[j];
        
    }
    int data=4/2;
   double result= nums3[data]+nums3[data+1]/2;
//     for(int j=0;j<nums3.length;j++){
 System.out.println(result);
//     }

}
}
   
