package tracks.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author amruta.kajrekar
 */
public class CompareTriplets {

        static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
            // Complete this function
            int APoints =0, BPoints=0;
            if(a0>b0){
                APoints++;
            }else if (b0>a0){
                BPoints++;
            }

            if(a1>b1){
                APoints ++;
            }else if (b1>a1){
                BPoints++;
            }

            if(a2>b2){
                APoints ++;
            }else if (b2>a2){
                BPoints++;
            }
            Arrays.sort(new int[]{});
            return new int[]{APoints, BPoints};
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a0 = in.nextInt();
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int b0 = in.nextInt();
            int b1 = in.nextInt();
            int b2 = in.nextInt();
            int[] result = solve(a0, a1, a2, b0, b1, b2);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
}
