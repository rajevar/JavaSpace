package com.lambda;

import com.common.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTRAndThen {
    public static void main(String args[]){
        Function<Person, String> funcEmpToString= (Person e)-> {return e.getFirstName();};
        List<Person> employeeList=
                Arrays.asList(new Person("Tom Jones", 45),
                        new Person("Harry Major", 25),
                        new Person("Ethan Hardy", 65),
                        new Person("Nancy Smith", 15),
                        new Person("Deborah Sprightly", 29));
        Function<String,String> initialFunction= (String s)->s.substring(0,1);
        List<String> empNameListInitials=convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
        empNameListInitials.forEach(str->{System.out.print(" "+str);});
    }
    public static List<String> convertEmpListToNamesList(List<Person> employeeList, Function<Person, String> funcEmpToString){
        List<String> empNameList=new ArrayList<String>();
        for(Person emp:employeeList){
            empNameList.add(funcEmpToString.apply(emp));
        }
        return empNameList;
    }

//    private static List<String> convertEmpListToNamesList(List<Person> empList, Function<Person, String> f) {
//        List<String> empNameList=new ArrayList<String>();
//        empList.forEach(e -> {
//            empNameList.add(f.apply(e));
//        });
//        return empNameList;
//    }
}
