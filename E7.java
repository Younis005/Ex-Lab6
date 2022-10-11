import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        int num;
        int binary_arr[]=new int[32];
        int counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        System.out.println("the number in binary");
        while (num>0){
            binary_arr[counter]=num%2;
            num/=2;
            counter++;
        }
        for (int i = counter; i >=0 ; i--) {
            System.out.println(binary_arr[i]);
        }
    }
}
