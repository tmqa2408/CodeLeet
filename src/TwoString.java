import java.util.ArrayList;
import java.util.List;

public class TwoString {
    public static void main(String[] args) {
        List<String> a =new ArrayList<>();
        List<String> b =new ArrayList<>();
        a.add("la");
        a.add("cd");
        a.add("ef");

        b.add("World");
        b.add("ee");
        b.add("ef");

        commonSubstring(a, b);
    }
    public static void commonSubstring(List<String> a, List<String> b) {

        for (int i = 0; i < a.size(); i++) {

            String ai = a.get(i);
            String bi = b.get(i);
            int lenghtAi = ai.length();
            int lenghtBi = bi.length();

 //           int minSize = Math.min(lenghtAi, lenghtBi);

            int quaEq = 0;
            for (int j = 0; j < lenghtBi; j++) {
                String t = bi.substring(j,j + 1);
                if (ai.contains(t)) quaEq++;
            }

            /*
            for ( int j = 0; j < lenghtAi; j++){
                int temp = 0;
                for ( int k = 0; k < lenghtBi; k++ ){
                    if (ai.substring(j,j + 1).equals(bi.substring(k, k + 1))) {
                        quaEq++;
                        j = lenghtAi;
                    break;
                    }
                }
            }
            */

            if ( quaEq > 0) System.out.println("YES");
           else System.out.println("NO");
        }

    }

}
