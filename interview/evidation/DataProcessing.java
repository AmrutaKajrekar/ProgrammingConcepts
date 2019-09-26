package evidation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;


/**
 * @author amruta.kajrekar on 9/4/19.
 */
public class DataProcessing {
  public static void main(String[] args) throws SQLException {
    DataProcessing dp = new DataProcessing();
    DataProcessing
        .readCsv("/Users/212431401/work/projects/workspace/ProgrammingConcepts/interview/Book1.csv",
            "/Users/212431401/work/projects/workspace/ProgrammingConcepts/interview/Book2.csv");
  }


  private static void readCsv(String f1,String f2){
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";

    try {

      br = new BufferedReader(new FileReader(f1));
      while ((line = br.readLine()) != null) {

        // use comma as separator
        String[] linearr = line.split(cvsSplitBy);

        System.out.println();

      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
