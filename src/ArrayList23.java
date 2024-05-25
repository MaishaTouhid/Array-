
import java.util.*;
public class ArrayList23 {
    private ArrayList<Integer> values;

    public   ArrayList23() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public  ArrayList23 append( ArrayList23 other) {
        ArrayList23 result = new  ArrayList23();
        for (Integer val : this.values) {
            result.add(val);
        }
        for (Integer val : other.values) {
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList23 a = new  ArrayList23();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList23 b = new  ArrayList23();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ArrayList23 appendedSequence = a.append(b);
        System.out.println(appendedSequence.toString());
    }
}