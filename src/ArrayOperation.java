import java.util.*;
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] values = {1,2,3,4,5,6,7,8,9,3};
        System.out.println("Every element at an even index: ");
        for(int i = 0 ; i < 10 ; i++){
            if(i % 2 == 0){
                System.out.print(values[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Every even element:");
        for(int i = 0 ; i < 10 ; i++){
            if(values[i] % 2 == 0){
                System.out.print(values[i] + " ");
            }
        }
        System.out.println();
        System.out.println("All elements in reverse order:");
        for(int i = 9 ;i >= 0 ; i--){
            System.out.print( values[i] + " ");
        }
        System.out.println();
        System.out.println("Only the first and last element:");
        System.out.print(values[0] + " "+ values[9]);

    }
}
