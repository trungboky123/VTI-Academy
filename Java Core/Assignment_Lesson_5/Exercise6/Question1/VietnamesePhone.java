package Exercise6.Question1;

public class VietnamesePhone extends Phone{
    @Override
    public void insertContact(String name, String phone){
        for(int i = 0; i < numberOfContacts; i++){
            if(contacts[i].name.equalsIgnoreCase(name)){
                System.out.println("Existed Contact!");
            }

        }
        if(numberOfContacts < maxNumber){
            contacts[numberOfContacts] = new Contact(name, phone);
            System.out.println("Added contact!");
            numberOfContacts++;
        }
        else{
            System.out.println("Maximum of contact reached!");
        }
    }

    @Override
    public void removeContact(String name){
        int found = 0;
        for(int i = 0; i < numberOfContacts; i++){
            if(contacts[i].name.equals(name)){
                for(int j = i; j < numberOfContacts - 1; j++){
                    contacts[j] = contacts[j + 1];
                }
                contacts[numberOfContacts - 1] = null;
                numberOfContacts--;
                i--;
                found++;
            }
        }
        if(found > 0){
            System.out.println("Removed contact named: " + name);
        }
        else{
            System.out.println("Cannot find the contact named: " + name);
        }
    }

    @Override
    public void updateContact(String name, String newPhone){
        for(int i = 0; i < numberOfContacts; i++){
            if(contacts[i].name.equals(name)){
                contacts[i].phone = newPhone;
                System.out.println("Updated new phone number to: " + name);
            }
            else{
                System.out.println("Cannot find the contact named: " + name);
            }
        }
    }

    @Override
    public void searchContact(String name){
        int found = 0;
        for(int i = 0; i < numberOfContacts; i++){
            if(contacts[i].name.equals(name)){
                System.out.println(contacts[i]);
                found++;
            }
        }
        if(found == 0){
            System.out.println("Cannot find the contact named: " + name);
        }
    }
}
