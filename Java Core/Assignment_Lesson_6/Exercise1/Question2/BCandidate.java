package Assignment_Lesson_6.Exercise1.Question2;

public class BCandidate extends Candidate{
    public BCandidate(String registrationNumber, String fullName, String address, int priorityLevel){
        super(registrationNumber, fullName, address, priorityLevel);
    }

    @Override
    public void printInfo(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Priority Level: " + priorityLevel);
        System.out.println("Type: B(Maths - Chemistry - Biology)");
    }
}
