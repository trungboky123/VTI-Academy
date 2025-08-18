package Exercise2;

import java.util.Scanner;

public class Voucher extends Benefit{
    protected String displayFormat;
    protected String code;

    @Override 
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter display format (QRCODE, BARCODE, ORIGINAL): ");
            displayFormat = scanner.nextLine().toUpperCase();
        } while (!displayFormat.matches("QRCODE|BARCODE|ORIGINAL"));

        do {
            System.out.println("Enter 6-character code: ");
            code = scanner.nextLine();
        } while (!code.matches("(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6}"));
    }

    @Override 
    public String toString(){
        return super.toString() + ", Display Format: " + displayFormat + ", Code: " + code;
    }
}
