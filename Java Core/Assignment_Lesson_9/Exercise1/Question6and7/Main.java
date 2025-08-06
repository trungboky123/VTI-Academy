package Assignment_Lesson_9.Exercise1.Question6and7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Hien");
        students.put(2, "An");
        students.put(3, "Huong");
        students.put(4, "Hieu");

        // a) Print out all the keys
        List<Integer> listID = new ArrayList<>();
        System.out.println("Key: ");
        for (Integer id : students.keySet()) {
            listID.add(id);
        }
        System.out.println(listID);

        // b) Print out all the values
        List<String> listName = new ArrayList<>();
        System.out.println("Values: ");
        for (String name : students.values()) {
            listName.add(name);
        }
        System.out.println(listName);

        // c) Print out the student list sorted by name
        System.out.println("Students sorted by name: ");
        List<Map.Entry<Integer, String>> list = new ArrayList<>(students.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, String> entry : list){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // d) Convert map students to set students
        System.out.println("Set of students: ");
        Set<Map.Entry<Integer, String>> studentSet = students.entrySet();
        for (Map.Entry<Integer,String> entry : studentSet) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
