package problems.arrays;

/**
 * @author amruta.kajrekar on 7/9/18.
 */
public class ReplaceNearest {

    public static void main(String[] args){
        ReplaceNearest rep = new ReplaceNearest();
        int[] arr = new int[]{7,5,6,3,4,1,2,9,11};
        arr = rep.replacenearestBigger(arr);
        rep.printArray(arr);
    }

    public int[] replacenearestBigger(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    break;
                }
            }
        }

        return arr;
    }

    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
