import java.util.Arrays;

public class heightCheckerTest {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};



        System.out.println(Arrays.toString(heights) + "   curent");
        heightChecker(heights);

        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] targHeight = new int[heights.length];
        for (int i=0; i < heights.length; i++){
            targHeight[i] = heights[i];
        }
        int nOfSt = 0;
        for (int i = 0; i < targHeight.length; i++){
            int min = targHeight[i];
            int idx = i;
            for ( int j =i; j < targHeight.length; j++){
                if( targHeight[j] < min){ min = targHeight[j];
                idx =j;}
            }
            targHeight[idx] = targHeight[i];
            targHeight[i] = min;
        }
        System.out.println(Arrays.toString(targHeight) + "   target");
        for ( int i = 0; i < heights.length; i++){
            if ( heights[i] != targHeight[i]){
                nOfSt++;
            }
        }
        return nOfSt;
    }
}
