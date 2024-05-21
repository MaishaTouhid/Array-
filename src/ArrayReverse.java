import java.util.*;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] values = new  int [10];
        for(int i = 0 ; i < 10 ; i++){
            values[i] = in.nextInt();
        }
        for(int i = 9 ;i >= 0 ; i--){
            System.out.println( values[i]);
        }

    }
}
