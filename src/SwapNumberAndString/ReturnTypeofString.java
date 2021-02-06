package SwapNumberAndString;

public class ReturnTypeofString {

    public static void main(String[] args) {

        String tech = "Tech interview preparation document";
        String[] words = tech.split(" "); //will split the string with spaces
        System.out.println(words.length);

        for(String string:words) {
            System.out.println(string);
        }
    }
}
