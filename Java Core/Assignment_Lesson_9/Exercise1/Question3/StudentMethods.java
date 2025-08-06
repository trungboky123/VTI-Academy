package Assignment_Lesson_9.Exercise1.Question3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMethods {
    public static Student findStudentByID(Set<Student> students, int id){
        for (Student s : students) {
            if(s.id == id){
                return s;
            }
        }
        return null;
    }

    public static Student findStudentByName(Set<Student> students, String name){
        for(Student s : students){
            if(s.name.equals(name)){
                return s;
            }
        }
        return null;
    }

    public static Set<Student> findDuplicateNames(Set<Student> students){
        Map<String, Integer> count = new HashMap<>();
        Set<Student> duplicateNameStudents = new HashSet<>();
        for (Student s : students) {
            String name = s.name;
            count.put(name, count.getOrDefault(name, 0) + 1);
        }
        for (Student s : students) {
            if(count.get(s.name) > 1){
                duplicateNameStudents.add(s);
            }
        }
        return duplicateNameStudents;
    }

    public static void deleteNameByID(Set<Student> students){
        for (Student s : students) {
            if(s.id == 2){
                s.name = null;
            }
        }
    }

    public static void removeStudentByID(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if(student.id == 5){
                iterator.remove();
            }
        }
    }
}
