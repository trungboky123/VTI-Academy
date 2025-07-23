package Assignment_Lesson_5.Exercise1;

import java.time.LocalDate;

import Assignment_Lesson_5.Exercise1.Question2.Account;

public class Question3 {
    public static class Group {
        String name;
        String creator;
        Account [] accounts;
        LocalDate createDate;

        public Group(){

        }

        public Group(String name, String creator, Account [] accounts, LocalDate createDate){
            this.name = name;
            this.creator = creator;
            this.accounts = accounts;
            this.createDate = createDate;
        }

        public Group(String name, String creator, String [] usernames, LocalDate createDate){
            this.name = name;
            this.creator = creator;
            this.createDate = createDate;
            this.accounts = new Account[usernames.length];
            for (int i = 0; i < usernames.length; i++) {
                this.accounts[i] = new Account(i, creator, usernames[i], name, name)
            }
        }
    }
    public static void main(String[] args) {
        Group g1 = new Group();

        Account creator = new Account(0, null, "admin", null, null);
        Account acc1 = new Account(0, null, "user1", null, null);
        Account acc2 = new Account(0, null, "user2", null, null);

        Account[] accountList = {acc1, acc2};
        Group g2 = new Group(null, null, accountList, null);

        String[] usernames = {"alice", "bob", "charlie"};
        Group groupC = new Group(null, null, usernames, LocalDate.now());
    }
}
