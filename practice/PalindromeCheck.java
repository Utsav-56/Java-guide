package practice;


import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String rev = new StringBuffer(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

    }
}




