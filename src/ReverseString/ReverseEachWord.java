package ReverseString;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "I love Java";
        String reversed = "";
        String[]array = str.split("");
        for(int i=0; i<array.length; i++) {
            String word = "";
            for(int j = array[i].length()-1; j>=0; j--) {
                word+= array[i].charAt(j);
            }
            reversed = reversed + word+ "";
        }
        System.out.println(reversed);
    }

}
