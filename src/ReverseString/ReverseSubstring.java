package ReverseString;

public class ReverseSubstring {

    public static void main(String[] args) {



        String reversed = "";
        String toReverse = "Hello Tech World";
        for(int i = toReverse.length(); i>=1; i--){
            reversed += toReverse.substring(i-1, i);
        }
        System.out.println("Reversed string is: " + reversed);

    }
}
