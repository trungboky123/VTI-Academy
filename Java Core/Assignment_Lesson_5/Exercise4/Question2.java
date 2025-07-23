package Assignment_Lesson_5.Exercise4;

public class Question2 {

    // Class Circle
    public class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle(){
            
        }

        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(double radius, String color){
            this.radius = radius;
            this.color = color;
        }

        public double getRadius(){
            return this.radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public String getColor(){
            return this.color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }

        @Override
        public String toString(){
            return "Radius: " + radius + ", color: " + color;
        }
    }
    // Class Account
    public class Account{
        private String id;
        private String name;
        private int balance;

        public Account(String id, String name, int balance){
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public String getID(){
            return this.id;
        }

        public String getName(){
            return this.name;
        }

        public int getBalance(){
            return this.balance;
        }

        public void credit(int amount){
            this.balance += amount;
        }

        public void debit(int amount){
            if(balance < amount){
                System.out.println("Insufficient balance !");
            }
            else{
                this.balance -= amount;
            }
        }

        public void transferTo(Account account, int amount){
            if(balance < amount){
                System.out.println("Insufficient balance !");
            }
            else{
                this.balance -= amount;
                account.credit(amount);
            }
        }
    }

    // Class Date
    public class Date{
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay(){
            return this.day;
        }

        public void setDay(int day){
            this.day = day;
        }

        public int getMonth(){
            return this.month;
        }

        public void setMonth(int month){
            this.month = month;
        }

        public int getYear(){
            return this.year;
        }

        public void setYear(int year){
            this.year = year;
        }

        @Override
        public String toString(){
            return String.format("%02d/%02d/%02d", day, month, year);
        }

        public boolean isLeapYear(){
            if((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
