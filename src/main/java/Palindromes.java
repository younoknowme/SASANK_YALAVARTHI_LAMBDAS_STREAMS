import java.util.*;
import java.util.stream.Collectors;

public class Palindromes {

    // Method checks if the given String is a Palindrome
    private static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {

        // Initiating Scanner Object to take input of values
        Scanner scannerObject = new Scanner(System.in);

        // Number of Elements In the Given List
        int totalNumberOfStrings = scannerObject.nextInt();

        // Initializing an ArrayList to hold the Strings
        List<String> listOfStrings = new ArrayList<>();

        // Taking the input of Strings into the List through STDIN
        for (int i = 0; i < totalNumberOfStrings; i++) {
            String inputString = scannerObject.next();
            listOfStrings.add(inputString);
        }

        // Converting List to Stream and filtering palindrome strings
        // and adding them to a list
        List<String> listOfPalindromes = listOfStrings.stream()
                                            .filter(Palindromes::isPalindrome)
                                                .collect(Collectors.toList());

        //Printing all the valid palindromes in the given list to STDOUT
        listOfPalindromes.forEach(System.out::println);

    }
}
