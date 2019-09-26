package interviews;

/**
 * @author amruta.kajrekar on 8/5/18.
 */
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class test2
{
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  List<List<Integer>> ClosestXdestinations(int numDestinations,
      List<List<Integer>> allLocations,
      int numDeliveries)
  {
    // WRITE YOUR CODE HERE
    int num = numDestinations;
    List<List<Integer>> list = new ArrayList<List<Integer>>(numDeliveries);
    //sort
    Comparator<List<Integer>> comp = new Comparator<List<Integer>>(){
      @Override
      public int compare(List<Integer> l1, List<Integer> l2){
        //  System.out.println("l1.get(0)="+ l1.get(0) + ", l1.get(1)="+ l1.get(1));
        //  System.out.println("l2.get(0)="+ l2.get(0) + ", l2.get(1)="+ l2.get(1));
        int a = (l1.get(0)*l1.get(0) + l1.get(1)*l1.get(1));
        int b = (l2.get(0)*l2.get(0) + l2.get(1)*l2.get(1));
        //  System.out.println("a="+ a + ",b="+ b);

        if (a<b) return -1;
        else if(a==b) {return 0; }
        else return 1;
      }
    };

    Collections.sort(allLocations,comp);
    for(int i=0;i<numDeliveries;i++){
      // System.out.println("compare= "+ allLocations.get(i));
      list.add(allLocations.get(i));
    }

    return list;

  }
  // METHOD SIGNATURE ENDS
}
