package Assignments.Assignment_Lesson_6.Exercise1.Question2;

public abstract class Candidate {
    protected String registrationNumber;
    protected String fullName;
    protected String address;
    protected int priorityLevel;

    public Candidate(String registrationNumber, String fullName, String address, int priorityLevel){
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.address = address;
        this.priorityLevel = priorityLevel;
    }

    public abstract void printInfo();
}
