package interviews;

import java.util.HashSet;
import java.util.Set;

/**
 * @author amruta.kajrekar on 7/26/18.
 */
public class TrieN {

  public static void main(String[] args){
    TrieN n = new TrieN();
    System.out.print(n.getHighestFrequencyOfSubstring(2,3,4,"ababab"));
  }
  TrieNode root;
  Set distinctCharacters = new HashSet<>();

  public int getHighestFrequencyOfSubstring(int k, int l, int m, String s) {
    int n = 0;
    if (s == null || n == 0) {
      return 0;
    }
    if (k < 0 || l < 0 || m <= 0) {
      return 0;
    }
    int maxFrequency = 1;
    root = new TrieNode();
    for (int i = 0; i < n; ++i) {
      for (int j = k; j <= l && j <= n; ++j) {
        String substring = s.substring(i,j);
        int currentFrequency = insertIntoTrie(substring, m);
        if (currentFrequency == -1)
          break;
        maxFrequency = (currentFrequency > maxFrequency) ? currentFrequency : maxFrequency;
      }
      k += 1;
      l += 1;
    }
    return maxFrequency;
  }

  public int insertIntoTrie(String word, int m) {
    distinctCharacters.clear();
    TrieNode parent = root;
    for(char c : word.toCharArray()) {
      distinctCharacters.add(c);
      if (distinctCharacters.size() > m) {
        return -1;
      }
      int i = c - 'a';
      if(parent.next[i] == null)
        parent.next[i] = new TrieNode();
      parent = parent.next[i];
    }
    if (parent.word != null) {
      parent.frequency += 1;
    } else {
      parent.word = word;
      parent.frequency = 1;
    }
    return parent.frequency;
  }

  class TrieNode {
    TrieNode[] next = new TrieNode[26];
    String word;
    int frequency = 0;
  }
}
