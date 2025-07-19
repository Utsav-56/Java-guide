package error_handling;

/*
Steps to create a custom exception:
1. Create a new class that extends Exception
2. Create a constructor for the class that takes a message as a parameter
3. Call super(message) in the constructor

And all set you did it

 */
//class InvalidAgeException extends Exception {
//    public InvalidAgeException(String msg) {
//        super(msg);
//    }
//}

/*
    Steps to use the custom exception:
    1. Create a method that throws the custom exception
    2. Call the method in a try block and catch the exception
*/

class Test {
    static int age = 3;

    static void setAge(int n) throws InvalidAgeException {
        if (n < 0) {
            throw new InvalidAgeException("Age must be Positive number");
        }
        age = n;
    }

    public static void main(String[] args) {
        try {
            setAge(-4);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            // or put any message you like
        }
    }
}

class THrowsEg {
    void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
}