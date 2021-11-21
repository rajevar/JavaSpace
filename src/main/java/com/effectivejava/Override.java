package com.effectivejava;

class BuggyBread1 {

    public String method() {
        return "Base Class - BuggyBread1";
    }

}


class BuggyBread2 extends BuggyBread1 {

    private static int counter = 0;
    public String method() {

        return "Derived Class - BuggyBread2";

    }

}

public class Override {


    public static void main(String[] args) {

        BuggyBread1 bg = new BuggyBread1();
        System.out.println(bg.method());

        BuggyBread1 bg2 = new BuggyBread2();
        System.out.println(bg2.method());

    }
}
