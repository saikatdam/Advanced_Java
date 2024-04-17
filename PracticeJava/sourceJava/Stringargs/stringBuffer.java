import java.io.*; 
public class stringBuffer { 
    public static void main(String[] args) 
    { 
  
        // Create input stream 'demo.txt' 
        // for reading containing 
        // text "GEEKSFORGEEKS" 
        FileInputStream inputStream 
            = new FileInputStream("c:/demo.txt"); 
  
        // Convert inputStream to 
        // bufferedInputStream 
        BufferedInputStream buffInputStr 
            = new BufferedInputStream( 
                inputStream); 
  
        // Read number of bytes available 
        int rem_byte = buffInputStr.available(); 
  
        // Byte array is declared 
        byte[] barr = new byte[rem_byte]; 
  
        // Read byte into barr, 
        // starts at offset 1, 
        // 5 bytes to read 
        buffInputStr.read(barr, 1, 5); 
  
        // For each byte in barr 
        for (byte b : barr) { 
            if (b == (byte)0) 
                b = (byte)'-'; 
            System.out.print((char)b); 
        } 
    } 
} 