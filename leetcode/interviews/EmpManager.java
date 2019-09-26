package interviews;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar on 5/22/18.
 */
public class EmpManager {

  public static void main(String[] args){
    EmpManager emp = new EmpManager();
    HashMap<String, String> pairs = new HashMap<>();
    pairs.put("A", "C");
    pairs.put("B", "C");
    pairs.put("C", "F");
    pairs.put("D", "E");
    pairs.put("E", "F");
    pairs.put("F", "F");
    System.out.println(emp.getDictionary(pairs));
    System.out.println("Finished!");
  }

  public HashMap<String, Integer> getDictionary(HashMap<String, String> pairs){
    HashMap<String, Integer> list = new HashMap<>();

    for (Map.Entry<String, String> p: pairs.entrySet()){
      if(list.containsKey(p.getValue())){
        list.put(p.getValue(), list.get(p.getValue())+1);
      }else{
        list.put(p.getValue(), 1);
      }
    }

    return list;
  }
}
