package Assignments.Assignment_Lesson_2.Exercise1;

import Assignments.Assignment_Lesson_1.Question1.*;

public class Question10 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");

        Account a1 = new Account(0, "NguyenVanA@gmail.com", null, "Nguyen Van A", d1, null, null);
        Account a2 = new Account(0, "NguyenVanB@gmail.com", null, "Nguyen Van B", d2, null, null);

        Account[] accounts = {a1, a2};

        for(int i = 0; i < accounts.length; i++){
            System.out.println("Account " + (i + 1));
            System.out.println("Email : " + accounts[i].email);
            System.out.println("Full Name: " + accounts[i].fullName);
            System.out.println("Department: " + accounts[i].department.name);
        }
    }
}
