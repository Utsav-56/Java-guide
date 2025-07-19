package error_handling;

class TryCatchExample {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error divided by zero.");
        } finally {
            System.out.println("do cleanup!, code, I will always run");
        }
    }
}