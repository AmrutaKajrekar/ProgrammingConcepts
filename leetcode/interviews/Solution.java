package interviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/4/18.
 */
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        HashMap<String, List<Integer>> documentApplicationMap = new HashMap<>();
        HashSet<String> docTypesWeHave = new HashSet<>();
        HashSet<Integer> applicationIdsWeHave = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] col = line.split(",");

        int docTypeCol = -1;
        int appIdCol = -1;
        for (int i=0;i<col.length;i++) {
            if(col[i].trim().equalsIgnoreCase("docType")){
                docTypeCol = i;
            }
            if(col[i].trim().equalsIgnoreCase("applicationId")){
                appIdCol = i;
            }
        }
        try {
            while (scan.hasNextLine()) {
                String[] input = scan.nextLine().split(",");

                List<Integer> list;
                if(documentApplicationMap.containsKey(input[docTypeCol].trim())){
                    list = documentApplicationMap.get(input[docTypeCol].trim());
                }else{
                    list = new ArrayList<>();
                }
                list.add(Integer.parseInt(input[appIdCol].trim()));
                documentApplicationMap.put(input[docTypeCol].trim(),list);

                docTypesWeHave.add(input[docTypeCol].trim());
                applicationIdsWeHave.add(Integer.parseInt(input[appIdCol].trim()));

            }
            checkIfDocumentsPresent(docTypesWeHave,applicationIdsWeHave,documentApplicationMap);
        }
        finally {
                scan.close();
            }
        }

    private static void checkIfDocumentsPresent(HashSet<String> docTypesWeHave,
            HashSet<Integer> applicationIdsWeHave,
            HashMap<String, List<Integer>> documentApplicationMap) {
        
        for(String doc:docTypesWeHave){
            List<Integer> applications = documentApplicationMap.get(doc);
            System.out.println(doc);

            if(!applications.containsAll(applicationIdsWeHave)) {

                for (Integer i:applicationIdsWeHave) {
                    if(!applications.contains(i)){
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
//csv.c,Amruta,Bank document, 1, 1
//fileName,owner, docType,applicationId,content
