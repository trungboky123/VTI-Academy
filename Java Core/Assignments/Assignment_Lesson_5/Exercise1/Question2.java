package Assignments.Assignment_Lesson_5.Exercise1;

import java.time.LocalDate;

public class Question2 {
    public static class Account {
        int id;
        String email;
        String username;
        String firstName;
        String lastName;
        String fullName;
        String position;
        LocalDate createDate;

        public Account(){

        }

        public Account(int id, String email, String username, String firstName, String lastName){
            this.id = id;
            this.email = email;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = firstName + " " + lastName;
        }

        public Account(int id, String email, String username, String firstName, String lastName, String position){
            this.id = id;
            this.email = email;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = firstName + " " + lastName;
            this.position = position;
            this.createDate = LocalDate.now();
        }

        public Account(int id, String email, String username, String firstName, String lastName, String position, LocalDate createDate){
            this.id = id;
            this.email = email;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = firstName + " " + lastName;
            this.position = position;
            this.createDate = createDate;
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(1, "trung@gmail.com", "hien123", "Nguyen", "Trung Hien");
        Account a3 = new Account(2, "vqh2004@gmail.com", "huong123", "Vu", "Quynh Huong", "Sale");
        Account a4 = new Account(3, "dangkhai2000@gmail.com", "dk123", "Dang", "Quang Khai", "Manager", LocalDate.of(2021, 10, 15));

        System.out.println(a1.email);
        System.out.println(a2.firstName);
        System.out.println(a3.fullName);
        System.out.println(a4.createDate);
    }
}
