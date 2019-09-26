package birst;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author amruta.kajrekar on 2/28/19.
 */
public class CodingChallenge {
  private Hashtable<String,String> table = new Hashtable<String,String>();
  static Logger LOGGER = Logger.getLogger(CodingChallenge.class.getName());

  public static void main(String[] args){
    CodingChallenge ch = new CodingChallenge();
    ch.startProgram();
  }

  public int getSizeOfTable(){
    return table.size();
  }

  public void startProgram() {
    printMenu();
    Scanner scanner = new Scanner(System.in);

    while(true) {
      String choice = scanner.nextLine();
      String[] action = choice.trim().split(" ");

      if (action == null
          || ((action[0]!=null && !action[0].equalsIgnoreCase("GETALL") && !action[0].equalsIgnoreCase("QUIT"))
          && (action.length != 2 || action[1]!=null && !action[1].isEmpty() && action[0].equalsIgnoreCase("CREATE") && !action[1].contains("=")) )) {
        System.out.println("Invalid input");
        LOGGER.warning("Invalid input");
      } else {

        switch (action[0].toUpperCase()) {
          case "CREATE":
            try {
              create(action[1]);
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }
            break;


          case "UPDATE":
            try {
              update(action[1]);
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }
            break;


          case "GET":
            try {
              get(action[1]);
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }
            break;


          case "DELETE":
            try {
              delete(action[1]);
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }
            break;


          case "GETALL":
            getAll();
            break;


          case "QUIT":
            System.out.println("Exiting the program");
            return;


          default:
            System.out.println("Incorrect choice");
            LOGGER.warning("Incorrect choice");
        }
      }
    }

  }


  /**
   * Creates a key-value pair
   * @param key key to be entered
   */
  public void create(String key) throws Exception {
    String[] pair = key.split("=");
    if(!validatePair(pair) ) System.out.println("Invalid key-value pair");
    else{
      if(pair.length==2 && pair[0]!=null && pair[1]!=null && !pair[0].isEmpty() && !pair[1].isEmpty()) {
        if(table.containsKey(pair[0])){
          LOGGER.warning("## Key '" + pair[0] + "' already exists ##");
          throw new Exception("## Key '" + pair[0] + "' already exists ##");
        }else {
          table.put(pair[0], pair[1]);
          System.out.println("Key-value pair created for " + pair[0] + "=" + pair[1]);
        }
      }else{
        throw new Exception("Invalid key-value pair");
      }
    }
  }

  /**
   * Update a key-value pair
   * @param key key to be updated
   */
  public void update(String key) throws Exception {
    String[] pair = key.split("=");
    if(!validatePair(pair) ) System.out.println("Invalid key-value pair");
    else{
      if(!table.containsKey(pair[0])){
        LOGGER.warning("## Key '" + pair[0] + "' does not exist ##");
        throw new Exception("## Key '" + pair[0] + "' does not exist ##");
      }else {
        table.put(pair[0], pair[1]);
        System.out.println("Key-value pair updated for " + pair[0] + "=" + pair[1]);
      }
    }
  }

  /**
   * Get key-value pair
   * @param key key to be searched
   */
  public void get(String key) throws Exception {
    if(!table.containsKey(key)){
      if(!doesHierarchyExist(key)) {
        LOGGER.warning("## Key '" + key + "' does not exist ##");
        throw new Exception("## Key '" + key + "' does not exist ##");
      }
    }else {
      System.out.println(table.get(key));
    }
  }


  /**
   * Delete a key-value pair.
   * @param key key to be deleted
   */
  public void delete(String key) throws Exception {
    if(!table.containsKey(key)){
      LOGGER.warning("Key '" +key + "' not found");
      throw new Exception("Key '" +key + "' not found");
    }else {
      String value = table.get(key);
      table.remove(key);
      System.out.println("Key-value pair deleted for " + key + "=" + value);
    }
  }

  /*
  private boolean doesHierarchyExist(String key) {
    boolean found = false, match;
    String[] hier = key.split("/");
    for(Map.Entry<String,String> e: table.entrySet()){
      String[] entry = e.getKey().split("/");
      int i=0;match=false;
      for(String h:hier){
        if(entry!=null && entry.length>=i && entry[i]!=null && h.equalsIgnoreCase(entry[i])) {
          match = true;
          i++;
        }
      }
      if(match) {
        System.out.println(e.getKey() + "=" + e.getValue());
        found=true;
      }
    }
    return found;
  }*/

  private boolean doesHierarchyExist(String key) {
    boolean found = false;
    for(Map.Entry<String,String> e: table.entrySet()){
      if(e.getKey().contains(key)) {
        System.out.println(e.getKey() + "=" + e.getValue());
        found=true;
      }
    }
    return found;
  }

  /**
   * Prints all the key-value pairs.
   */
  public void getAll() {
    for(Map.Entry<String,String> e: table.entrySet()){
      System.out.println(e.getKey() + "=" + e.getValue());
    }
  }

  /**
   * Validates the key-value pair passed in.
   Pair array should only contain 2 elements representing key and value.
   * @param pair
   * @return boolean true if valid, false otherwise
   */
  public boolean validatePair(String[] pair) {
    return (pair!=null && pair.length==2 && pair[0]!=null && pair[1]!=null
        && !pair[0].isEmpty() && !pair[1].isEmpty() && pair[0]!= " " && pair[1]!= " ");
  }

  /**
   * Prints the menu.
   */
  private void printMenu() {
    System.out.println("-------------------------");
    System.out.println("Please select an action:");
    System.out.println("CREATE");
    System.out.println("UPDATE");
    System.out.println("GET");
    System.out.println("DELETE");
    System.out.println("GETALL");
    System.out.println("QUIT");
    System.out.println("-------------------------");
  }
}
