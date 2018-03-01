package contest.c73;

import java.util.HashMap;

/**
 * @author amruta.kajrekar
 */
public class RotatedDigits {
    public static void main(String[] args){
        RotatedDigits rotate = new RotatedDigits();
        System.out.println(rotate.rotatedDigits(857));
    }
        public int rotatedDigits(int N) {
            int counter = 0;
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            //int[] arr = new int[]{2,5,6,9};
            map.put(0,0);
            map.put(1,1);
            map.put(2,5);
            map.put(3,-1);
            map.put(4,-1);
            map.put(5,2);
            map.put(6,9);
            map.put(7,-1);
            map.put(8,8);
            map.put(9,6);

            //for each digit in N, get the rotation and check if the newN != oldN && does not contain -1
            if(N<=0) return 0;
            for(int i=1; i<=N; i++){
                //get the digits
                char[] temp = Integer.toString(i).toCharArray();
                boolean isDigitOk = false;
                for (int j = 0; j < temp.length ; j++) {
                    int oriN = Character.getNumericValue(temp[j]);
                    int newN = map.get(oriN);
                    if(newN == -1){
                        isDigitOk = false;
                        break;
                    }else{
                        if(newN != oriN){
                            isDigitOk = true;
                        }
                    }
                }
                if(isDigitOk){
                    counter++;
                }

            }

            return counter;
        }
}
