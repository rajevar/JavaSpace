package com.justjava;

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}
interface Triangle {
    void display();
}

class AnonymousDemo {
    public void createClass() {
        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
    public void create2() {
        // using lamda instead of anonynmous inner class.
        Triangle t =  () -> System.out.println("Inside an anonymous Triangle class.");
        t.display();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
        an.create2();
        Polygon p = new Polygon();
        p.display();
    }
}
