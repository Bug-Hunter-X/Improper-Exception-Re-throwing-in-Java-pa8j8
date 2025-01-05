public class UncommonBugSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: Division by zero!");
            //Log the original exception for debugging purposes
            e.printStackTrace();
            //Handle the exception appropriately
            //For example, return a default value, use an alternative calculation, etc.
            System.out.println("Using a default value instead of throwing the exception");
        }
    }
}