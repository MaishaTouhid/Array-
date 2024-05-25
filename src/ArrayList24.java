import java.util.*;
public class ArrayList24 {
    private ArrayList<Integer> values;

    public  ArrayList24() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public  ArrayList24 merge( ArrayList24 other) {
        ArrayList24 merged = new  ArrayList24();
        int i = 0;
        int j = 0;

        while (i < values.size() || j < other.values.size()) {
            if (i < values.size()) {
                merged.add(values.get(i));
                i++;
            }
            if (j < other.values.size()) {
                merged.add(other.values.get(j));
                j++;
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        ArrayList24 a = new  ArrayList24();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList24 b = new  ArrayList24();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ArrayList24 mergedSequence = a.merge(b);
        System.out.println(mergedSequence.toString());
    }
}
