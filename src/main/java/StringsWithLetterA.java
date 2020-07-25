import java.util.*;
import java.util.stream.Collectors;

public class StringsWithLetterA {

    public static void main(String[] args) {

        // Initiating Scanner Object to take input of values
        Scanner scannerObject = new Scanner(System.in);

        // Number of Elements In the Given List
        int totalNumberOfStrings = scannerObject.nextInt();

        // Initializing an ArrayList to hold the Strings
        List<String> listOfStrings = new ArrayList<>();

        // Taking the input of Strings into the List
        for (int i = 0; i < totalNumberOfStrings; i++) {
            String inputString = scannerObject.next();
            listOfStrings.add(inputString);
        }

        // Another list to store the values of resulting strings
        List<String> answerListOfStrings = new ArrayList<>();

        // filtering the string with starting character as 'a' and of length 3
        // and Collecting them in a different List
        answerListOfStrings = listOfStrings.stream()
                .filter(producer -> producer.charAt(0) == 'a' && producer.length() == 3)
                .collect(Collectors.toList());

        // printing the list that contains strings of length 3 and starting with 'a'
        answerListOfStrings.forEach(System.out::println);
    }
}
