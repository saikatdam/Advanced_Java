
public  class Sparse {
 public static void main(String args[]){
int nzero=0;
int zero=0;
int p=0,k=0;
 int a[][]={
  {1,0,0,2,3,6},
 {1,0,0,2,3,6},
{9,0,0,0,10,11}};

int i,j;
 for(i=0;i<a.length;i++){
  
  for(j=0;j<6;j++){
  //Now we have to find out the values that are non zero
  if (a[i][j]!=0){
  nzero++;
}else{
   zero++; 
}
}
}

  System.out.println("Number of nzero is :" + nzero +" and number of zero is :" +zero);
    int b[][]=new int[nzero][3];
for(i=0;i<a.length;i++){
  
  for(j=0;j<6;j++){
 
   if(a[i][j]!=0){
       b[p][0]=i;
       b[p][1]=j;
        b[p][2]=a[i][j];
      p++;
       
   }
 else{
     continue;
 }
}
}
System.out.println("After Calculation :-");
System.out.println("\n");
System.out.println("******Sparse Matrix******");
System.out.println("\n");
for(i=0;i<p;i++){
  
  for(j=0;j<3;j++){
      System.out.print(b[i][j]+ "\t");
}
System.out.println("\n");
}
}
}