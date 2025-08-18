package Exercise3.Question7;

public class Main {
    public static void main(String[] args) {
        Phone<String, String> p1 = new Phone<String, String>("trunghiennguyen71@gmail.com", "0833210030");
        Phone<Integer, String> p2 = new Phone<Integer, String>(11, "0363051104");
        Phone<String, String> p3 = new Phone<String, String>("Hieu", "0886620126");
        
        System.out.println("User1: ");
        System.out.println("Email: " + p1.getKey() + ", Phone Number: " + p1.getPhoneNumber());
        System.out.println("User2: ");
        System.out.println("Number: " + p2.getKey() + ", Phone Number: " + p2.getPhoneNumber());
        System.out.println("User3: ");
        System.out.println("Name: " + p3.getKey() + ", Phone Number: " + p3.getPhoneNumber());
    }
}
