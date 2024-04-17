public class recursionPlay {

      
            public static void main(String[] args) {
                int n = 4; // Change the value of n to get the Fibonacci sequence up to a different number
                System.out.println("Fibonacci sequence up to " + n + ":");
                // for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(n) + " ");
               2
            }
        
            public static int fibonacci(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return fibonacci(n - 1) + fibonacci(n - 2);
                }
            }
        }
   
