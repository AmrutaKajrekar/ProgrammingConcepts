package problems.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author amruta.kajrekar on 5/4/18.
 */
public class test1 {

    public static void main(String[] args){
        test1 test = new test1();
//        System.out.print(electionWinner(new String[]{"Alex","Michael","Harry", "Michael","Alex","Michael"}));
//        System.out.print(getMovieTitles("spiderman"));
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Integer arrSize = Integer.parseInt(line.split(" ")[0]);
        Integer ops = Integer.parseInt(line.split(" ")[1]);
        int[] list = new int[arrSize];

        int max = Integer.MIN_VALUE;
        for (int i=0;i<ops;i++){
            String[] val = in.nextLine().split(" ");
            int from = Integer.parseInt(val[0]);
            int to = Integer.parseInt(val[1]);
            int addend = Integer.parseInt(val[2]);

            for(int j=from-1; j<to;j++){
                list[j]+=addend;
                if(max<list[j]) max=list[j];
            }
        }

        System.out.print(max);
    }

    static String electionWinner(String[] votes) {
        /*
         * Write your code here.
         */
        int max = Integer.MIN_VALUE;
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for(int i=0; i<votes.length;i++){
            if(!map.containsKey(votes[i])){
                map.put(votes[i],1);
                if(max<1) max=1;
            }else{
                map.put(votes[i],map.get(votes[i])+1);
                if(max<(map.get(votes[i]))) max=map.get(votes[i]);

            }
        }

        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==max){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        return list.get(list.size()-1);


    }


    static String[] getMovieTitles(String substr) {
        return readJsonObject(substr).toArray(new String[0]);
    }

    private static ArrayList<String> readJsonObject(String substr) {
        StringBuilder response = new StringBuilder();
        String movieUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr;
        try {
            URL url = new URL(movieUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            ArrayList<String> list = new ArrayList<String>();
            while((line=buff.readLine())!=null){
                response.append(line);
                if(line.startsWith("Title")){
                    list.add(line.split(":")[1].replace("\"",""));
                    System.out.print(line.split(":")[1].replace("\"",""));
                }
            }
            buff.close();
            return list;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //    static String[] getMovieTitles(String substr) {
//        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+"spiderman";
//        try {
//            InputStream is = new URL(url).openStream();
//            BufferedReader buff = new BufferedReader(new InputStreamReader(is));
//            String json = readAll(buff);
//            JSONObject obj = new JSONObject(json);
//            return json;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main2(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String[] votes = new String[votesCount];

        for (int votesItr = 0; votesItr < votesCount; votesItr++) {
            String votesItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            votes[votesItr] = votesItem;
        }

        String res = electionWinner(votes);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
