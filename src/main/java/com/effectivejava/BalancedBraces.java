package com.effectivejava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBraces {

    static Map<String, String> charMap = new HashMap<String, String>();
    static {
        charMap.put("{", "}");
        charMap.put("<", ">");
        charMap.put("[", "]");
        charMap.put("(", ")");
    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>();
        boolean isGood = true;
        for (int c=0; c < s.length(); c++) {
            String str = String.valueOf(s.charAt(c));
            if ( str.equals("(") || str.equals("{") || str.equals("<") || str.equals("[") ) {
                stack.add(charMap.get(str));
            } else {
                if(stack.empty()) {
                    isGood = false;
                    break;
                }
                String pop = stack.pop();
                if (pop != null && !pop.equals(str)) {
                    isGood = false;
                    break;
                }
            }
        }
        return  isGood && stack.empty() ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("balanced.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
