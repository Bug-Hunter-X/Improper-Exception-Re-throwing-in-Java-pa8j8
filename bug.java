public class UncommonBug {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
            //This is wrong and will cause another bug
            throw new RuntimeException(e);
        }
    }
}