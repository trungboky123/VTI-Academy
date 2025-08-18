package Exercise4.Question5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyen Van Nam");
        listWildcards.add(30);
        listWildcards.add("Ha Dong - Ha Noi");

        System.out.println("Name: " + listWildcards.get(0));
        System.out.println("Age: " + listWildcards.get(1));
        System.out.println("Address: " + listWildcards.get(2));
    }
}
