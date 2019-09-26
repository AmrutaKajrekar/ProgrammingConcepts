package interviews;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author amruta.kajrekar on 7/5/18.
 */
public class MaxVotes {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


//        int votesCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] votes = new String[votesCount];
//
//        for (int i = 0; i < votesCount; i++) {
//            String votesItem = scanner.nextLine();
//            votes[i] = votesItem;
//        }
        String[] votes = new String[]{"April", "May", "April", "May", "June"};
        String res = electionWinner(votes);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
    static String electionWinner(String[] votes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String s:votes){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (maxEntry == null
                    || (entry.getValue().compareTo(maxEntry.getValue()) >= 0 && entry.getKey().compareTo(maxEntry.getKey()) > 0)){
                maxEntry = entry;
            }
        }


    return maxEntry.getKey();
    }

}
