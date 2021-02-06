package LargestNumber;

public class SecondLargestInterview {
    public static void main(String[] args) {

        int [] array = {12, 7, 12, 15, 0, 13, -1};

        int largest = array[0];
        int secondLargest = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            };
        }
        System.out.println("The largest number= " + largest+ " and secondLargest= " + secondLargest);
    }
}
