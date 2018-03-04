package contest.c67;

/**
 * @author amruta.kajrekar.
 * #765 Couples Holding Hands
 * N couples sit in 2N seats arranged in a row and want to hold hands. We want to know the minimum number of swaps so that every couple is sitting side by side. A swap consists of choosing any two people, then they stand up and switch seats.

The people and seats are represented by an integer from 0 to 2N-1, the couples are numbered in order, the first couple being (0, 1), the second couple being (2, 3), and so on with the last couple being (2N-2, 2N-1).

The couples' initial seating is given by row[i] being the value of the person who is initially sitting in the i-th seat.
Example 1:

Input: row = [0, 2, 1, 3]
Output: 1
Explanation: We only need to swap the second (row[1]) and third (row[2]) person.
Example 2:

Input: row = [3, 2, 0, 1]
Output: 0
Explanation: All couples are already seated side by side.
Note:

len(row) is even and in the range of [4, 60].
row is guaranteed to be a permutation of 0...len(row)-1.

 */
public class CouplesHoldingHands {
    private int counter =0;
    public static void main(String[] args){
        CouplesHoldingHands sol = new CouplesHoldingHands();
        int[] row =
    //                {0,2,1,3,7,5,6,4};
                {6,2,1,7,4,5,3,8,0,9};
    //        int[] row = {3,2,0,1};
        System.out.println(sol.minSwapsCouples(row));
    }


    public int minSwapsCouples(int[] row) {
        for(int i=0;i<row.length-1;i=i+2){
            for(int j=i+1;j<row.length;j=j+1) {
                if (Math.abs(row[i] - row[j]) == 1 && checkCoupleConditions(i,j,row)) {
                    if(Math.abs(i-j)!=1 ){
                        //if not adjacent then swap
                        counter++;
                        row = swap(i+1,j,row);
                    }
                    break;
                }
            }
        }
        return counter;
    }

    private boolean checkCoupleConditions(int i, int j, int[] row) {
        boolean isCouple = false;
        //find min and max. min = row[i] and max= row[j]

        int smaller= (row[i]<row[j]) ? row[i] : row[j];
        int greater= (row[i]>row[j]) ? row[i] : row[j];

        if(smaller==0 && greater==1){
            isCouple=true;
            return isCouple;
        }
        if(smaller%2==0 && greater%2==1){
            isCouple=true;
            return isCouple;
        }
        return isCouple;
    }

    public int minSwapsCouples2(int[] row) {
        for(int i=0;i<row.length-1;i=i+2){
            for(int j=i+1;j<row.length;j=j+1) {
                if (Math.abs(row[i] - row[j]) == 1) {
                    if(Math.abs(i-j)!=1 ){
                        //if not adjacent then swap
                        counter++;
                        row = swap(i+1,j,row);
                    }
                    break;
                }
            }
        }
        return counter;
    }

    private int[] swap(int i, int j, int[] row) {
        int temp = row[i];
        row[i]=row[j];
        row[j]=temp;
        return row;
    }

}
