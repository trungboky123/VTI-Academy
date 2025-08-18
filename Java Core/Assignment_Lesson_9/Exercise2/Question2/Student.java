package Exercise2.Question2;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public LocalDate birthDate;
    public double score;

    public Student(int id, String name, LocalDate birthDate, double score){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.score = score;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", BirthDate: " + birthDate + ", Score: " + score;
    }

    @Override
    public int compareTo(Student s){
        int nameCompare = this.name.compareTo(s.name);
        if(nameCompare != 0){
            return nameCompare;
        }
        int dateCompare = this.birthDate.compareTo(s.birthDate);
        if(dateCompare != 0){
            return dateCompare;
        }
        else{
            return Double.compare(this.score, s.score);
        }
    }
}
