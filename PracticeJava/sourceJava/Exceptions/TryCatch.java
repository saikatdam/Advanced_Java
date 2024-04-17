 public class TryCatch {
    public static void main(String[] args) {
        try {
       
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
          
            System.err.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
          
            System.out.println("This block will always be executed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
