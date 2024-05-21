import java.util.*;
public class LargestAndSmallestArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10 ; i++) {
            numbers[i] = in.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < 10 ; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                largestIndex = i;
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                smallestIndex = i;
            }
        }

        System.out.println("Array elements with markers for smallest and largest:");
        for (int i = 0; i < 10 ; i++) {
            if (i == largestIndex) {
                System.out.println(numbers[i] + " <- largest");
            }
            else if (i == smallestIndex) {
                System.out.println(numbers[i] + " <- smallest");
            }
            else {
                System.out.println(numbers[i]);
            }
        }
    }
}
