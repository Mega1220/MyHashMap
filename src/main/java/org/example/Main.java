package org.example;

public class Main {
    static void main() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("А", 1);
        map.put("Б", 2);
        map.put("В", 3);

        System.out.println(map.get("Б"));
        map.remove("Б");
        System.out.println(map.get("Б"));
        System.out.println(map.size());
    }
}
