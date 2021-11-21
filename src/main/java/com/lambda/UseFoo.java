package com.lambda;

import java.util.function.Function;

public class UseFoo {
    String method(String c, Foo foo) {
        return foo.method(c);
    }

   public String add(String c, Function<String, String> fn) {
        return fn.apply(c);
    }

    public static void main(String[] args) {
        UseFoo use = new UseFoo();
        Foo foo = param -> "Hello " + param;
        String str = use.method("world!!", foo); // using functional interface
        System.out.println(str);

        Function<String, String> fn = parameter -> parameter + " from Lambda!";
        String s = use.add("Delivered ", fn); // using lambda
        System.out.println(s);

        Foo foo_ = (param) ->  param + "Blah";
        UseFoo uf = new UseFoo();
        String str_ = uf.method("Say, ", foo_);
        System.out.println(str_);


    }
}
