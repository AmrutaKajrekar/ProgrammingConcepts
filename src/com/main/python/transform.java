package com.main.python;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author amruta.kajrekar on 3/20/19.
 */
public class transform {

  public static void main(String[] args) {

    String csvFile = "/Users/212431401/work/projects/enterprise/edge/US334773combinedloadtests/jmx/allpoints.csv";
    String output = "/Users/212431401/work/projects/enterprise/edge/US334773combinedloadtests/jmx/new_250_points.csv";

    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";

    int count = 1;
    int max = 250;
    

    try {

      br = new BufferedReader(new FileReader(csvFile));
      BufferedWriter write = new BufferedWriter(new FileWriter(output));
      while ((line = br.readLine()) != null) {

        // use comma as separator
        // String[] country = line.split(cvsSplitBy);

        System.out.println("line = " + line);
        //put 250 lines on 1 line
        if(count>max) {
          count = 1;
          write.newLine();
        }
        write.write(line+",");
        count++;
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
