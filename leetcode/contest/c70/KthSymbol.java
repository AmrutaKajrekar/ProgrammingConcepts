package contest.c70;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author amruta.kajrekar
 * leetcode problem #779
 */
public class KthSymbol {

    public static void main(String[] args){
        KthSymbol sym= new KthSymbol();
        System.out.println(sym.kthGrammar(8,74));
    }

    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K-1)%2;
    }

    public int kthGrammarMatrix(int N, int K) {
        if(N<1 || N>30) return -1;
        double col = Math.pow(2,(N-1));
        if(K<1 || K> col) return -1;
        int[][] mat = new int[N][(int) col];
        N-=1; K-=1;
        for(int i=0;i<N; i++){
            for (int j=0;j<col ;j++){
                mat[i][j]=-1;
            }
        }
        mat[0][0]=0;

        for(int i=1;i<=N; i++){
            int counter =0;
           for (int j=0;j<=col ;j++){
               int prev = mat[i - 1][j];
               if(prev==0 ||prev ==1){
                   if(prev==0) {
                       mat[i][counter]=0;
                       counter++;
                       mat[i][counter]=1;
                       counter++;
                   }else if(prev==1) {
                       mat[i][counter]=1;
                       counter++;
                       mat[i][counter]=0;
                       counter++;
                   }
               }else{
                   break;
               }
           }
        }

        for(int i=0;i<N; i++){
            for (int j=0;j<col ;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        return mat[N][K];
    }


    public int kthGrammarHash(int N, int K) {
        if(N<1 || N>30) return -1;
        if(K<1 || K> (Math.pow(2,(N-1)))) return -1;
        HashMap<Integer,String> list = new HashMap<Integer,String>();
        list.put(1,"0");
        System.out.println("0");
        for(int i=2;i<=N; i++){
            String prev = list.get(i - 1);
            //iterate through and replace chars
            StringBuilder str = new StringBuilder();
            for (char c:prev.toCharArray()) {
                if(c=='0') str.append("01");
                else if(c=='1') str.append("10");
            }
            list.put(i,str.toString());
            System.out.println(str.toString());
        }

        return Integer.parseInt(list.get(N).charAt(K-1)+"");
    }

    public int kthGrammarList(int N, int K) {
        if(N<1 || N>30) return -1;
        if(K<1 || K> (Math.pow(2,(N-1)))) return -1;
        N-=1; K-=1;
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"0");
        System.out.println("0");
        for(int i=1;i<=N; i++){
            String prev = list.get(i - 1);
            //iterate through and replace chars
            StringBuilder str = new StringBuilder();
            for (char c:prev.toCharArray()) {
                if(c=='0') str.append("01");
                else if(c=='1') str.append("10");
            }
            list.add(i,str.toString());
            System.out.println(str.toString());
        }

        return Integer.parseInt(list.get(N).charAt(K)+"");
    }
}
