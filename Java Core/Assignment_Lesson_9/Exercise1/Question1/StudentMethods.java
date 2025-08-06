package Assignment_Lesson_9.Exercise1.Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMethods {
    public static void searchById(List<Student> students, int id){
        int found = 0;
        for(Student s : students){
            if(s.id == id){
                System.out.println("Found student with id " + id + ", name: " + s.name);
                found++;
            }
        }
        if(found == 0){
            System.out.println("Cannot find student with id:" + id);
        }
    }

    public static void searchByName(List<Student> students, String name){
        int found = 0;
        for(Student s : students){
            if(s.name == name){
                System.out.println("Found student with name " + name + ", id: " + s.id);
                found++;
            }
        }
        if(found == 0){
            System.out.println("Cannot find student with name:" + name);
        }
    }

    public static List<Student> findDuplicateNames(List<Student> students){
        Map<String, Integer> count = new HashMap<>();
        List<Student> duplicateNameStudents = new ArrayList<>();

        for(Student s : students){
            String name = s.name;
            count.put(name, count.getOrDefault(name, 0) + 1);
        }

        for(Student s : students){
            if(count.get(s.name) > 1){
                duplicateNameStudents.add(s);
            }
        }
        return duplicateNameStudents;
    }

    public static void removeStudentNameByID(List<Student> students){
        for(Student s : students){
            if(s.id == 2){
                s.name = null;
            }
        }
    }

    public static void removeStudentByID(List<Student> students){
        students.removeIf(student -> student.id == 5);
    }
}
