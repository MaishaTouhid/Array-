import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] values = new int[10];
       // int sum = 0;
        for(int i=0;i<10;i++){
            values[i] =  in.nextInt();
        }
        int sum = values[0];
        for(int i=1;i<10;i++){
          if(i % 2 == 0){
              sum = sum + values[i];
          }
            if(i % 2 != 0){
                sum = sum - values[i];
            }
        }

        System.out.println("sum : " + sum);
    }
}