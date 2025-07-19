package iterator;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");


        Iterator<String> rs = list.iterator();

        System.out.println("Fruits in list:");

        while (rs.hasNext()) {
            System.out.println(rs.next());
        }

    }
}
