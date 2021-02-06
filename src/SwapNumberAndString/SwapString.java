package SwapNumberAndString;

public class SwapString {

    public static void main(String[] args) {
        String x = "Hello";
        String y = "Tech";
        x = x + y;
        y = x.substring(0, (x).length()-y.length());
        x = x.substring(y.length());

        System.out.println("x  = " + x);
        System.out.println("y = " +y);
    }

}
