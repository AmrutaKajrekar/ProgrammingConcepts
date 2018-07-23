package problems.arrays;

/**
 * @author amruta.kajrekar on 7/21/18.
 */
public class ReshapeMatrix {
  public static void main(String[] args){
    ReshapeMatrix self = new ReshapeMatrix();
    System.out.println(self.matrixReshape(new int[][]{{1},{2},{3},{4}}, 2,2));
  }

  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int p=0, q=0, n = nums.length, m= nums[0].length;
    if(n*m < r*c) return nums;

    int[][] ret = new int[r][c];

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.println("p="+p+",q="+q);
        ret[p][q] = nums[i][j];
        if(q<c-1)
          q++;
        else if(q==c-1){
          q=0; p++;
          if(p==r) {
            System.out.println("inside p="+p+",q="+q);
            return ret;
          }
        }else{
          System.out.println("else.");
        }
      }
    }
    return ret;
  }

}
