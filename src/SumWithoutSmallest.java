import java.util.*;
public class SumWithoutSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10 ; i++) {
            numbers[i] = in.nextInt();
        }
        int smallest = numbers[0];
        int sum = 0;
        for (int i = 1; i < 10 ; i++) {
            sum = sum + numbers[i];
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println( sum - smallest);

    }
}
