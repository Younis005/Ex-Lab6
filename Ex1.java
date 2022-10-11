import java.time.Year;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double balance;
        double interest_rate;
        double interest;
        int year=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the initial balance");
        balance=in.nextByte();
        System.out.println("Enter the rate of initial");
        interest_rate=in.nextByte();
        interest_rate/=100;
        while (balance<1000000){
            interest=interest_rate*balance;
            balance+=interest;
            year++;
        }
        System.out.println("Years="+year);
    }
}
