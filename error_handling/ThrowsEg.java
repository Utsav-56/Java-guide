package error_handling;

class Info{
    static int age = 10;

    static void setAge(int n) throws ArithmeticException {
        if (n < 0) {
            throw new ArithmeticException("Age must be Positive number");
        }
        age = n;
    }
}


public class ThrowsEg {

    public static void main(String[] args) {
        try {
            Info.setAge(-4);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // or put any message you like
        }
    }

}

