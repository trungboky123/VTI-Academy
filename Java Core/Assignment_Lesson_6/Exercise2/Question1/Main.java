package Exercise2.Question1;

public class Main {
    public static void main(String[] args) {
        Student [] students = new Student[10];
        students[0] = new Student(1, "Nguyen Van A", 1);
        students[1] = new Student(2, "Nguyen Van B", 1);
        students[2] = new Student(3, "Nguyen Van C", 1);
        students[3] = new Student(4, "Nguyen Van D", 2);
        students[4] = new Student(5, "Nguyen Van E", 2);
        students[5] = new Student(6, "Nguyen Van F", 2);
        students[6] = new Student(7, "Nguyen Van G", 3);
        students[7] = new Student(8, "Nguyen Van H", 3);
        students[8] = new Student(9, "Nguyen Van I", 3);
        students[9] = new Student(10, "Nguyen Van K", 3);

        for(Student s : students){
            s.attendanceCheck();
        }

        for(Student s : students){
            if(s.group == 1){
                s.studying();
            }
        }

        for(Student s : students){
            if(s.group == 2){
                s.cleaning();
            }
        }
    }
}
