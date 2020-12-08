import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class meanderingAr {
    public static void main(String[] args) {
        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(-1);
        unsorted.add(1);
        unsorted.add(2);
        unsorted.add(3);
        unsorted.add(-5);
        System.out.println(meanderingArray(unsorted));

    }

    public static List<Integer> meanderingArray(List<Integer> unsorted) {
        // Write your code here
        List<Integer> sorted = new ArrayList<Integer>();
        Collections.sort(unsorted);
        int unsSize = unsorted.size();
        sorted.add(unsorted.get(unsSize-1));
        for ( int i = 1; i < unsSize; i++){
            if (i % 2 == 0) { sorted.add(unsorted.get(unsSize-i));}
            else { sorted.add(unsorted.get(i-1));
            }
        }




        return sorted;
    }
}
