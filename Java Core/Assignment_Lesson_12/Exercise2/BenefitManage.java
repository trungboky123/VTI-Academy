package Assignment_Lesson_12.Exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BenefitManage {
    protected List<Benefit> benefits = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBenefit(){
        Benefit b;
        int type;
        do {
            System.out.println("-----Add Benefit-----");
            System.out.println("1. Add Voucher");
            System.out.println("2. Add Telephone Consultant");
            System.out.println("Enter your choice (1 or 2): ");
            type = Integer.parseInt(scanner.nextLine());
        } while (type != 1 && type != 2);
        switch (type) {
            case 1:
                b = new Voucher();
                break;
            case 2: 
                b = new TelephoneConsultant();
                break;
            default:
                b = null;
                System.out.println("Invalid choice!");
                break;
        }
        if(b != null){
            b.input();
            benefits.add(b);
            System.out.println("Added successfully!"); 
        }   
    }

    public void updateVoucherByCode(){
        System.out.println("-----Update Voucher by Code-----");
        System.out.println("Enter voucher code: ");
        String codeFound = scanner.nextLine();
        int found = 0;

        for (Benefit b : benefits) {
            if(b instanceof Voucher v && v.code.equalsIgnoreCase(codeFound)){
                System.out.println("Found voucher!");
                System.out.println("Update your code!");
                v.input();
                System.out.println("Updated!");
                found = 1;
                break;
            }
        }
        if(found == 0){
            System.out.println("Voucher not found!");
        }
    }

    public void removedExpiredBenefit(){
        System.out.println("-----Removed Expired Benefit-----");
        Iterator<Benefit> iterator = benefits.iterator();
        while (iterator.hasNext()) {
            Benefit b = iterator.next();
            if(b.endDate != null && !b.endDate.isAfter(LocalDate.now())){
                iterator.remove();
            }
        }
        System.out.println("Removed Successfully!");
    }

    public void reportTelephoneConsultant(){
        System.out.println("-----Telephone Consultant Report-----");

        for (Benefit b : benefits) {
            if(b instanceof TelephoneConsultant tc && tc.duration > 10 && tc.isAvailable()){
                System.out.println(tc);
            }
        }


    }

    public void exit(){
        System.out.println("Exitting program...");
        System.exit(0);
        System.out.println("Exitting Successfully!");
    }
}
