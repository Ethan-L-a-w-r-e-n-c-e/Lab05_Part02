import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth;

        System.out.println("Enter your birth month [1-12]");
        if(scan.hasNextInt()){
            birthMonth = scan.nextInt();
            if(birthMonth > 0 && birthMonth <= 12){
                System.out.println("Your birth month is " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
                System.exit(0);
            }
        } else {
            System.out.println("You entered a wrong data type");
            System.exit(0);
        }
    }
}