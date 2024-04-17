class work1{
  String name;
    work1(String name ){
     this.name=name;
    }
 @Override
 public String toString(){
    
    return name;
 }
}



public class toStringg {
    
    public static void main(String args []){
        String str="saikat";
 
 work1 obj= new work1(str);
    System.out.println(obj);

    }
}