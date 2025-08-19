package Assignments.Assignment_Lesson_5.Exercise6.Question1;

public abstract class Phone {
    protected Contact [] contacts;
    protected int numberOfContacts;
    protected final int maxNumber = 100;

    public Phone(){
        contacts = new Contact[maxNumber];
        numberOfContacts = 0;
    }

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
