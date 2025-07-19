package sorting;

import java.util.*;

class STudent implements Comparable<STudent> {
    int id;
    String name;
    int age;

    STudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Implementing compareTo method to sort by age
    public int compareTo(STudent s) {
        if (age == s.age)
            return 0;
        else if (age > s.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<STudent> list = new ArrayList<>();
        list.add(new STudent(101, "Ram", 22));
        list.add(new STudent(102, "Shyam", 20));
        list.add(new STudent(103, "Hari", 21));

        Collections.sort(list); // sorts using compareTo()

        System.out.println("Students sorted by age:");
        for (STudent s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
