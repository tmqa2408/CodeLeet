import java.util.ArrayList;
import java.util.List;

public class tripletsTest {
    public static void main(String[] args) {
        long t = 8;
        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);

        System.out.println(triplets(t, d));

    }
    static long triplets(long t, List<Integer> d) {
        long result = 0;
        int s = d.size();
        for ( int i = 0; i < s; i++){
            for ( int j = 0; j < s; j++){
                for (int k = 0; k < s; k++){
                    if (i != j && j !=k && i != k) {
                        if ( d.get(i) < d.get(j) && d.get(j) < d.get(k)) {
                        if ( d.get(i) + d.get(j) + d.get(k) <= t) result++;}}
                }
            }
        }

        return result;
    }
}
