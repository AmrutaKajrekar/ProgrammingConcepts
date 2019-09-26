package problems.dynamicProgramming;

/**
 * @author 212431401 on 9/29/18.
 */
public class CheapestFlights {
  public static void main(String[] args) {
    int ret = new CheapestFlights().findCheapestPrice(3, new int[][]{{0,1,100},{1,2,100},{0,2,500}}, 0,2,0);
    System.out.print(ret);
  }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
      int cur = src, stops=K+1,price=0, ret =0;
      for(int i=0;i<flights.length;i++){
        if(cur==flights[i][0] && stops>0) {
          cur = flights[i][1];
          stops -=1;
          price += flights[i][2];
        }else if(cur==flights[i][0] && stops==0) {
          price += flights[i][2];
          ret = Math.max(ret, price);
          System.out.println("found = "+ flights[i][0]);
          System.out.println("price = "+ price);
        }else{
          if(flights[i][0]==src){
            cur = src;stops=K+1;
            ret = Math.max(ret, price);
            price=0;
          }
        }
      }
      return ret;
    }
  }

