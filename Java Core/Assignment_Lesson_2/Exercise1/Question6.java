package Exercise1;

import java.time.LocalDate;

import Sources.Account;
import Sources.Department;
import Sources.GroupAccount;
import Sources.PositionEnum;
import Sources.Position;
import Sources.Group;

public class Question6 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");
        Department d3 = new Department(3, "IT");

        Position p1 = new Position(1, PositionEnum.Dev);
        Position p2 = new Position(2, PositionEnum.Test);
        Position p3 = new Position(3, PositionEnum.PM);

        Account a1 = new Account(1, "john@example.com", "john", "John Doe", d1, p1, LocalDate.now());
        Account a2 = new Account(2, "jane@example.com", "jane", "Jane Smith", d2, p2, LocalDate.now());
        Account a3 = new Account(3, "bob@example.com", "bob", "Bob Lee", d3, p3, LocalDate.now());

        Group g1 = new Group(1, "Java Group", 1, LocalDate.now());
        Group g2 = new Group(2, "SQL Group", 2, LocalDate.now());
        Group g3 = new Group(3, "OOP Group", 3, LocalDate.now());

        GroupAccount ga1 = new GroupAccount(g1, a2, LocalDate.now());
        GroupAccount ga2 = new GroupAccount(g1, a3, LocalDate.now());
        GroupAccount ga3 = new GroupAccount(g2, a1, LocalDate.now());

        GroupAccount [] groupAccounts = {ga1, ga2, ga3};
        int count = 0;
        for (int i = 0; i < groupAccounts.length; i++) {
            if (groupAccounts[i].account == a2) {
                count++;
            }
        }
        switch (count) {
            case 0:
                System.out.println("This account hasn't got a group");
                break;
            case 1:
            case 2:
                System.out.println("This account's group is Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("This account belongs to an important person, participating in many group");
                break;
            default:
                System.out.println("This account belongs to a gossiper, participating in all groups");
                break;
        }
    }
}
