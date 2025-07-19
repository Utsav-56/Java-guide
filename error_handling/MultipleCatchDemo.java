package error_handling;

public class MultipleCatchDemo {
  public static void main(String[] args) {
    try {
      String name = null;
      name.length(); // this will throw NullPointerException


      int num = 10 / 0; // this will throw ArithmeticException

    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurred");
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception occurred");
    } catch (Exception e) {
      System.out.println("Some other exception occurred");
    }

  }
}




