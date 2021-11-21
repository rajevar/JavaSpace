package com.generics;

import java.util.HashMap;
import java.util.Map;

public class Animal {
    private Map<String,Animal> friends = new HashMap<>();

    public void addFriend(String name, Animal animal){
        friends.put(name,animal);
    }

    public <T extends Animal> T addFriend2(String name, Class<T> type ) {
        return type.cast(friends.get(name));
    }

    public Animal callFriend(String name){
        return friends.get(name);
    }

    public static void main(String[] args) {
        Mouse jerry = new Mouse();
        jerry.addFriend("spike", new Dog());
        jerry.addFriend("quacker", new Duck());

        ((Dog) jerry.callFriend("spike")).bark();
        ((Duck) jerry.callFriend("quacker")).quack();

        jerry.addFriend2("spike", Dog.class).bark();

    }
}