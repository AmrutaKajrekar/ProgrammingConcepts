package interviews;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author amruta.kajrekar on 7/25/18.
 */
public class MostFrequentSubStringUsingHash {
  /**
   *
   * @param minLength
   *            min length
   * @param maxLength
   *            max length
   * @param maxUnique
   *            number of unique characters
   * @param s
   *            the string
   * @return
   */
  static int getCount(int minLength, int maxLength, int maxUnique, String s) {
    Set<Character> unique = new HashSet<Character>();
    Map<String, Integer> map = new HashMap<>();
    for (int h = 0; h < s.length()-1; h++) {
      for (int t = h + minLength; t <= s.length() && t <= h + maxLength
          && unique.size() <= maxUnique; t++) {
        unique.clear();
        String subStr = s.substring(h, t);// this method does not
        // include last position
        if (map.containsKey(subStr)) {
          map.put(subStr, map.get(subStr) + 1);
          Objects.requireNonNull(s);
          Objects.requireNonNull(unique);
          for (char c : s.toCharArray())
            unique.add(c);
        } else {
          map.put(subStr, 1);
        }
      }
    }
    Comparator<Entry<String,Integer>> comp =
        (Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2)->((int)o2.getValue() - (int)o1.getValue());

    PriorityQueue<Entry<String, Integer>> queue = new PriorityQueue<Map.Entry<String, Integer>>(
        map.size(), comp);
    queue.addAll(map.entrySet());
    Map.Entry<String, Integer> entry = queue.poll();
    System.out.println(entry.getKey());
    return entry.getValue();
  }

  private static void populateSet(String s, Set<Character> uniqueChars) {
    Objects.requireNonNull(s);
    Objects.requireNonNull(uniqueChars);
    for (char c : s.toCharArray())
      uniqueChars.add(c);

  }

  public static void main(String[] args) {
    System.out.println(getCount(2, 3,4, "ababab"));

  }

}
