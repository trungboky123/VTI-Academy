package Exercise1.Question2;

import java.util.Scanner;

public class Admission implements IAdmission{
    protected Candidate [] candidates = new Candidate[100];
    protected int count = 0;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCandidate(){
        if(count >= candidates.length){
            System.out.println("Maximum of candidate reached!");
        }
        System.out.println("Enter type (A, B or C): ");
        String type = scanner.nextLine().toUpperCase();
        System.out.println("Enter the registration number: ");
        String registrationNumber = scanner.nextLine();
        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter priority level: ");
        int priorityLevel = scanner.nextInt();
        scanner.nextLine();

        Candidate candidate = null;
        switch (type) {
            case "A":
                candidate = new ACandidate(registrationNumber, fullName, address, priorityLevel);
                break;
            case "B":
                candidate = new BCandidate(registrationNumber, fullName, address, priorityLevel);
                break;
            case "C": 
                candidate = new CCandidate(registrationNumber, fullName, address, priorityLevel);
                break;
            default:
                System.out.println("Invalid type!");
                break;
        }
        candidates[count] = candidate;
        count++;
        System.out.println("Added candidate!");
    }

    @Override
    public void printAll(){
        for(int i = 0; i < count; i++){
            candidates[i].printInfo();
            System.out.println("-------------------");
        }
    }

    @Override
    public void searchCandidate(String registrationNumber){
        for(int i = 0; i < count; i++){
            if(candidates[i].registrationNumber.equalsIgnoreCase(registrationNumber)){
                candidates[i].printInfo();
            }
            else{
                System.out.println("Cannot find the candidate with registration number: " + registrationNumber);
            }
        }
    }
}
