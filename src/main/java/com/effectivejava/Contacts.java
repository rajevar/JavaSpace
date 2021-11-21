package com.effectivejava;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Contacts {

    /*
     * Complete the contacts function below.
     */
    static int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> finderList = new ArrayList<String>();
        Map<String, Integer> mapCount = new HashMap<String, Integer>();

        for( int i = 0; i < queries.length; i++ ) {
            if(queries[i][0].equals("add")) {
                String name = queries[i][1];
                String str="";
                for(int c=0; c<name.length(); c++) {
                    str += name.charAt(c);
                    if(map.get(str) != null) {
                        int counter = mapCount.get(str).intValue() + 1;
                        mapCount.put(str,counter);
                    } else {
                        mapCount.put(str,1);
                        map.put(str, str.hashCode());
                    }

                }
            } else {
                finderList.add(queries[i][1]);
            }
        }

        int[] testArray = new int[finderList.size()];
        for(int k=0; k < finderList.size(); k++) {
            Integer i = mapCount.get(finderList.get(k));
            if(mapCount.get(finderList.get(k)) != null) {
                testArray[k] = i.intValue();
            } else {
                testArray[k] = 0;
            }
        }
        return testArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("contacts.txt"));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write( String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
