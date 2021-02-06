package Polindrom;

public class PolindromeString {
    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";

        for (int i = original.length()-1; i >=0 ; i--) {
            reversed = reversed + original.charAt(i);

        }

        if(original.equals(reversed)) {
            System.out.println("given string is polindrome..");
        } else
            System.out.println("given string is not polindrome");

    }
}
