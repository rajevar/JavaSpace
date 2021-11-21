package com.justjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseText {

    public static void main(String[] args) {
        ParseText p = new ParseText();
        List<String> lst = p.parse("CLINDAMYCIN / BENZOYL (INJECTION) (ORAL) W/PUMP");
        System.out.println(lst);
    }

    public List<String> parse(String input) {
        List<String> routes = Arrays.asList("ORAL", "INJECTION");
        List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile("\\((.*?)\\)");
        Matcher regexMatcher = regex.matcher(input);

        while (regexMatcher.find()) {//Finds Matching Pattern in String
            matchList.add(regexMatcher.group(1));//Fetching Group from String
        }

        String route = null;
        List<String> params = new ArrayList<>();
        for(String item : matchList) {
            if (routes.stream().anyMatch(item::contains)) {
                route = item;
            } else {
                params.add(item);
            }
        }

        System.out.println("route: " + route);
        System.out.println(params);

        return matchList;
    }

    public static boolean stringContainsItemFromList(String inputStr, List<String> items) {
        return items.stream().anyMatch(inputStr::contains);
    }
}
