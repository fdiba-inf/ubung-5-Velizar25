package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        // Find unique numbers in numbers

        int arr[] = new int[size];
        int arrDup[] = new int[size];

        for(int i = 0; i < size; i++);{
          for(int j = 0; j < size; j++) {
            if(arr[i] == arrDup[j])
              break;
          } else if(arrDup[j] == 0){
            arrDup[j] = arr[i];
            break;
          }

        }


        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
