package Exercise5.Question2;

import Exercise5.Question1.Staff;

public class StaffManager {
    private Staff[] staffs;
    private int numberOfStaffs;
    private final int maxNumber = 100;
    
    public StaffManager(){
        staffs = new Staff[maxNumber];
        numberOfStaffs = 0;
    }

    public void addMoreStaffs(Staff staff){
        if(numberOfStaffs < maxNumber){
            staffs[numberOfStaffs] = staff;
            numberOfStaffs++;
            System.out.println("Added staff!");
        }
        else{
            System.out.println("Maximum of staff reached!");
        }
    }

    public void searchStaff(String fullName){
        int found = 0;
        for(int i = 0; i < numberOfStaffs; i++){
            if(staffs[i].getFullName().equals(fullName)){
                System.out.println("Found! " + staffs[i]);
                found = 1;
            }
        }
        if(found == 0){
            System.out.println("Cannot find the staff named: " + fullName);
        }
    }

    public void staffList(){
        if(numberOfStaffs == 0){
            System.out.println("Empty list of staff!");
        }
        else{
            for(int i = 0; i < numberOfStaffs; i++){
                System.out.println(staffs[i]);
            }
        }
    }

    public void deleteStaff(String fullName){
        int found = 0;
        for(int i = 0; i < numberOfStaffs; i++){
            if(staffs[i].getFullName().equals(fullName)){
                for(int j = i; j < numberOfStaffs - 1; j++){
                    staffs[j] = staffs[j + 1];
                }
                staffs[numberOfStaffs - 1] = null;
                numberOfStaffs--;
                i--; 
                found++;
            }
        }
        if(found > 0){
            System.out.println("Deleted staff named: " + fullName);
        }
        else{
            System.out.println("Cannot find the staff named: " + fullName);
        }
    }
}
