public class MyClassSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero detected.");
            // Handle the exception appropriately, perhaps by using a default value or logging the error
            z = Integer.MAX_VALUE; // Example: Use a default value
        }
        System.out.println(z);
    }
}