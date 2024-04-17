
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class fileHandling {
 public static void main(String args[]){
 
//  try{
// File myFile=new File("file.txt");
//  Scanner sc =  new Scanner (myFile);
//  while(sc.hasNextLine()){   
// String line= sc.nextLine();
// System.out.println(sc);
//  }
// sc.close();
// }
// catch(FileNotFoundException e){
//    System.out.println("file cannot be created");
//  e.printStackTrace();
  File myFile=new File("file.txt");
 if(myFile.delete()){
 System.out.println("i hava deleted the file named " +myFile.getName());

}else{
System.out.println("We are unsuccessful to delete the file named " +myFile.getName());
}
}  
}
