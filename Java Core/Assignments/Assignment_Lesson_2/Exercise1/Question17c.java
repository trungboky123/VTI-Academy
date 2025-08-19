package Assignments.Assignment_Lesson_2.Exercise1;

import Assignments.Assignment_Lesson_1.Question1.*;

public class Question17c {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");

        Account a1 = new Account(0, "NguyenVanA@gmail.com", null, "Nguyen Van A", d1, null, null);
        Account a2 = new Account(0, "NguyenVanB@gmail.com", null, "Nguyen Van B", d2, null, null);

        Account[] accounts = {a1, a2};
        int i = 0;

        do{
            System.out.println("Department: " + accounts[i].department.name);
            i++;
        } while (i < accounts.length);
    }
}
