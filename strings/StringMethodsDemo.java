package strings;

public class StringMethodsDemo {
  public static void main(String[] args) {
    String str = "  Hello Java World  ";

    System.out.println("Original String: '" + str + "'");

    // length()
    System.out.println("Length: " + str.length()); // includes spaces

    // trim()
    str = str.trim();
    System.out.println("After trim: " + str);

    // charAt()
    System.out.println("Character at index 1: " + str.charAt(1));

    // substring()
    System.out.println("Substring (6,10): " + str.substring(6,10));

    // toUpperCase() and toLowerCase()
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowercase: " + str.toLowerCase());

    // replace()
    System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

    // indexOf() and lastIndexOf()
    System.out.println("Index of 'a': " + str.indexOf('a'));
    System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

    // equals() and equalsIgnoreCase()
    String s2 = "hello java world";
    System.out.println("Equals s2: " + str.equals(s2));
    System.out.println("EqualsIgnoreCase s2: " + str.equalsIgnoreCase(s2));

    // compareTo()
    System.out.println("compareTo s2: " + str.compareTo(s2)); // positive if str>s2 lexicographically

    // contains()
    System.out.println("Contains 'Java': " + str.contains("Java"));

    // startsWith() and endsWith()
    System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
    System.out.println("Ends with 'World': " + str.endsWith("World"));

    System.out.println("Splitting by space:");


  }
}


