package strings;

public class StringBufferExample {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    sb.append(" World");
    System.out.println(sb); // prints Hello World

    sb.insert(5, " Java");
    System.out.println(sb); // prints Hello Java World

    sb.replace(6, 10, "Python");
    System.out.println(sb); // prints Hello Python World

    // deletes characters from index 5 to 12
    sb.delete(5, 12);
    System.out.println(sb); // prints Hello World

    sb.reverse();
    System.out.println(sb); // prints dlroW olleH
  }

}




