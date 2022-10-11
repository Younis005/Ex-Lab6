import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String text;
        char vowels []={'a','i','o','y'};
        int vowels_num=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text: ");
        text=in.next();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if(text.charAt(i)==vowels[j])
                    vowels_num++;
            }
        }
        System.out.println(text+"has"+vowels_num+"vowels letters");
    }
}
