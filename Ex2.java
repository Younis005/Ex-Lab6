import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int sum_even=0;
        for (int i = 2; i <= 100; i++) {
            if(i%2==0)
                sum_even+=i;
            System.out.println("sum of even number 2->100 ="+sum_even);

            int a,b;
            int sum_odd=0;
            Scanner in=new Scanner(System.in);

            System.out.println("Enter range from -> to");
            a=in.nextInt();
            b=in.nextInt();
            for (int j = a; j < b; j++) {
                if(i%2==0)
                    continue;
                sum_odd+=i;
            }
            System.out.println("sum of odd numbers from"+b+"="+sum_odd);

            int num;
            int digit;
            int sum_OddDigit=0;
            System.out.println("Enter a number: ");
            num=in.nextInt();
            while (num>0){
                digit=num%10;
                num/=10;
                if(digit%2==0)
                    continue;
                sum_OddDigit+=digit;
            }
            System.out.println("sum of digits ="+sum_OddDigit);
        }
    }
}
