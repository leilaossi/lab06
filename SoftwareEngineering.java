import java.util.Scanner;

public class SoftwareEngineering {

    public static void main(String[] args){
        int number1;
        int number2;

        Scanner scnr = new Scanner(System.in);

        number1 = scnr.nextInt();
        number2 = scnr.nextInt();

        int diff = number1 - number2;

        System.out.println(diff);
    }
}
