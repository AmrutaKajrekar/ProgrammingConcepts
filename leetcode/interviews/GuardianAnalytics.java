package interviews;

import java.util.HashMap;

/**
 * @author amruta.kajrekar on 8/29/18.
 *
A farmer has been asked to document the number of times his cows cross the road. He carefully logs data about his cows' locations, making a series of N observations over the course of a single day. Each observation records the ID number of a cow (an integer in the range 1 .. 10, since the farmer has 10 cows), as well as which side of the road the cow is on (0 if the cow is on one side, 1 of the cow is on the other)

Based on the data recorded by the farmer, please help him count the total number of confirmed crossings. A confirmed crossing occurs when a consecutive sightings of a cow place it on different sides of the road.

SAMPLE INPUT:

3 1
3 0 <<< this counts
6 0
2 1
4 1
3 0  <<< this doesn't count
4 0
3 1  << this counts

SAMPLE OUTPUT:

3
In this example, cow 3 crosses twice -- she first appears on side 1, then later appears on side 0, and then later still appears back on side 1. Cow 4 definitely crosses once. Cows 2 and 6 do not appear to cross.

Example: cows = {{3,1}, {3,0}, {6,0}, {2,1}, {4,1}, {3,0}, {4,0}, {3,1}}
 */
public class GuardianAnalytics {

  public static void main(String[] args){
    GuardianAnalytics ana = new GuardianAnalytics();
    System.out.print(ana.countCrossings(new int[][]{{3,1}, {3,0}, {6,0}, {2,1}, {4,1}, {3,0}, {4,0}, {3,1}}));
  }
  public int countCrossings(int[][] cow) {
    int count=0;
    HashMap<Integer, Integer> map =new HashMap<Integer,Integer>();

    for(int i=0;i<cow.length;i++){
      if(!map.containsKey(cow[i][0])){
        map.put(cow[i][0], cow[i][1]);
      }else{
        if(cow[i][1] != map.put(cow[i][0], cow[i][1])){
          count++;
        }
      }
    }

    return count;

  }
}
