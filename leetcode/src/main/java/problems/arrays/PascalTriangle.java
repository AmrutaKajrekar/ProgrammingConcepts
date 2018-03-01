package problems.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * @author amruta.kajrekar
 * leetcode problem #118
 */
public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle pascal = new PascalTriangle();
		List<List<Integer>> result = pascal.generate(10);
		Iterator<List<Integer>> it = result.iterator();
		System.out.print("[\n");
		while(it.hasNext()) {
			List<Integer> list = (List<Integer>) it.next();
			System.out.println(list+",");
		}
		System.out.print("]");
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();	
		int start=1;
		int rowCount=2;
		if(numRows > 0){
			//rowCount=0 here
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(start);
			result.add(list);
			if(numRows >=2){
			list = new ArrayList<Integer>();
			list.add(start);
			list.add(start);
			result.add(list);
			while(rowCount<numRows){
			//for rowCount =1
				list = new ArrayList<Integer>();
				list.add(start);
				List<Integer> preList = result.get(result.size()-1);
				for (int i = 0; i < preList.size()-1; i++) {
					list.add(preList.get(i) + preList.get(i+1));
				}
				list.add(start);
				result.add(list);
				rowCount++;
			}
		}
		}
		return result;
    }
}
