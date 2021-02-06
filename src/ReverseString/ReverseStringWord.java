package ReverseString;

public class ReverseStringWord {
    public static void main(String[] args) {

       // Using Reverse Function: StringBuffer
        String word = "Hello Tech World";

        StringBuffer sb = new StringBuffer(word);
        System.out.println("String Buffer: " + sb.reverse());


        String word1 = "Hello Tech World";
        StringBuilder strbld = new StringBuilder(word1);
        System.out.println("String Builder: " + strbld.reverse());
    }

}
