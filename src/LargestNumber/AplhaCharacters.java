package LargestNumber;

public class AplhaCharacters {
    public static void main(String[] args) {

        String given ="uwefywef??:245762fhgryfguyerf2475674267632&*ytey*&2)wfyw";

        String replaced = given.replaceAll("[^A-Za-z]", "");
        //replaceAll() takes the regex as a parameter. Once we use the regex A-Z or a-z find all the alphabetical
        // characters in the String '^' symbol means 'not'. In this example [^A-Za-z] replace all the
        // non alphabetical characters with empty space "".
        System.out.println(replaced.length());
    }
}
