package Assignments.Assignment_Lesson_12.Exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        BenefitManage bm = new BenefitManage();
        while (true) {
            System.out.println("Benefit Management:");
            System.out.println("1. Add Benefit");
            System.out.println("2. Update Voucher by Code");
            System.out.println("3. Removed Expired Benefit");
            System.out.println("4. Telephone Consultant Report");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1 - 5): ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bm.addBenefit();
                    break;
                case 2:
                    bm.updateVoucherByCode();
                    break;
                case 3:
                    bm.removedExpiredBenefit();
                    break;
                case 4:
                    bm.reportTelephoneConsultant();
                    break;
                case 5:
                    bm.exit();
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
