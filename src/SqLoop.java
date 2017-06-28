import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/28.
 */
public class SqLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String number = "";

        for (int i = 0; i <= num; i++) {

            number += (int) Math.pow(i, 2);
            number += "\n";

        }

        System.out.println(number);
    }

}
