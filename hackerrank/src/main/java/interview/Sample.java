package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar
 */
public class Sample {

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(Sample.oddNumbers(1,100000));

    }
    static int[] oddNumbers(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        int k=0;
        for(int i=l; i<=r;i++){
            if(!(i%2==0)){
                list.add(i);

            }
        }
        return list.stream().mapToInt(i ->  (i == null ? 0 : i)) .toArray();
    }
}
