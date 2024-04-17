public class array {
 public static void main(String args[]){

int a[][]={
  {1,0,0,2,3,6},
{3,4,5,0,0,8},
{9,0,0,0,10,11}};
  int b[][]=new int[a.length][a.length];
int i,j;
 for(i=0;i<a.length;i++){
  for(j=0;j<a.length;j++){
  //Now we have to find out the values that are non zero
  if (a[i][j]!=0)
   b[i][j]=a[i][j];
  continue;

}
}
  System.out.println(b[i][j]);
}
}