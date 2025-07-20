package Exercise2;

import java.time.LocalDate;

public class Question1 {
    public static class Account{
        public String email;
        public String username;
        public String fullName;
        public LocalDate createDate;
    }
    public static void main(String[] args) {
        Account [] accounts = new Account[5];
        for(int i = 0; i < accounts.length; i++){
            accounts[i] =  new Account();
            accounts[i].email = "Email " + (i + 1);
            accounts[i].username = "Username " + (i + 1);
            accounts[i].fullName = "FullName " + (i + 1);
            accounts[i].createDate = LocalDate.now();
        }
        for (Account account : accounts) {
            System.out.println("Email: " + account.email);
            System.out.println("Username: " + account.username);
            System.out.println("Full Name: " + account.fullName);
            System.out.println("Create Date: " + account.createDate);
            System.out.println("-----------------------------");
        }
    }
}
