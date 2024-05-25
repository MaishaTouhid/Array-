import java.util.*;
public class ArrayList25 {
    private ArrayList<Integer> values;

    public ArrayList25() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public ArrayList25 mergeSorted(ArrayList25 other) {
        ArrayList25 result = new ArrayList25();
        int i = 0, j = 0;

        while (i < this.values.size() && j < other.values.size()) {
            if (this.values.get(i) < other.values.get(j)) {
                result.add(this.values.get(i));
                i++;
            } else {
                result.add(other.values.get(j));
                j++;
            }
        }

        while (i < this.values.size()) {
            result.add(this.values.get(i));
            i++;
        }

        while (j < other.values.size()) {
            result.add(other.values.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList25 a = new ArrayList25();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList25 b = new  ArrayList25();
        b.add(4);
        b.add(7);
        b.add(9);
        b.add(9);
        b.add(11);

        ArrayList25 merged = a.mergeSorted(b);
        System.out.println(merged.toString());
    }
}
