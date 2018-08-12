package problems.arrays;

/**
 * @author amruta.kajrekar on 7/24/18.
 */
public class TrappingRainWater {

  public static void main(String[] args){
    TrappingRainWater water = new TrappingRainWater();
    System.out.print(water.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }

  public int trap(int[] height) {
    int max = 0;
    return findheight(height, 1, height[1], height[1], max);
  }

  public int findheight(int[] height, int index, int left, int right, int max) {
    int i=index, j=index;
    while(i>0 && j<height.length-1 && (height[i-1]>height[i] || height[j+1]>height[j])){
      if(height[i-1]>height[i]) i--;
      if(height[j+1]>height[j]) j++;
    }
    //calculate
    System.out.println("area = "+Math.min(height[i], height[j])+ " * "+(j-i-1));
    System.out.println("before max = "+max);
    max = Math.max(calculateheight(i,j, height), max);
    System.out.println("after max = "+max);
    if(j<height.length-1)
    findheight(height, j+1, height[j+1], height[j+1], max);
    return max;
  }

  private int calculateheight(int i, int j, int[] height) {
    int ret = (j - i - 1) * Math.min(height[i], height[j]);
    i++;j--;
    while(i!=j && i>=0 && j<=height.length) {
      ret-= (i+j);
      i++;j--;
    }

    return ret;
  }


}
