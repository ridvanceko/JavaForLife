package LargestNumber;

import java.util.Arrays;

public class SecondLargestNum {

    public static void main(String[] args) {

        int [] numArray = {12, 13, 12, 15, 0, -1};
        Arrays.sort(numArray);

        System.out.println(numArray[numArray.length-2]); // according to insertion order
    }


}
