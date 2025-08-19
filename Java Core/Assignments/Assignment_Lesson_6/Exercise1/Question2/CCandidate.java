package Assignments.Assignment_Lesson_6.Exercise1.Question2;

public class CCandidate extends Candidate{
    public CCandidate(String registrationNumber, String fullName, String address, int priorityLevel){
        super(registrationNumber, fullName, address, priorityLevel);
    }

    @Override
    public void printInfo(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Priority Level: " + priorityLevel);
        System.out.println("Type: C(Literature - History - Geography)");
    }
}
