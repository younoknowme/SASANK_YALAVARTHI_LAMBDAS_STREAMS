import java.util.*;
import java.util.function.BiConsumer;

public class Average {

    static void average(List<Integer> listOfNumbers, BiConsumer<Double, Integer> consumer) {

        //Initializing sum variable to zero
        double sumOfNumbers = 0;

        // Calculating the sum of all the numbers in the List.
        for (int currentVariable : listOfNumbers) sumOfNumbers += currentVariable;

        // if List has no numbers
        if (listOfNumbers.size() == 0) {
            System.out.println(0);
            return;
        }

        // Calculating the average of the given List
        consumer.accept(sumOfNumbers, listOfNumbers.size());
    }

    public static void main(String[] args) {

        // Initiating Scanner Object to take input of values
        Scanner scannerObject = new Scanner(System.in);

        // Number of Elements In the Given List
        int totalNumberOfElements = scannerObject.nextInt();

        // Initializing an ArrayList to hold the numbers
        List<Integer> listOfNumbers = new ArrayList<>();

        // taking input for the numbers
        for (int counter = 0; counter < totalNumberOfElements; counter++) {
            int number = scannerObject.nextInt();
            listOfNumbers.add(number);
        }

        // Calculating Average of numbers using Lambdas
        average(listOfNumbers, (sumOfNumbers, sizeOfList) -> System.out.println(sumOfNumbers / sizeOfList));

    }
}
