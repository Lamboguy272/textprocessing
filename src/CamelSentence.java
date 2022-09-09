import java.util.Scanner;
import java.io.*;


public class CamelSentence {

    public static void main(String[] args) {
        System.out.println("Enter your String:");

        Scanner scan = new Scanner(System.in);
        String name="";

        name+=scan.nextLine();
        scan.close();
        System.out.println("Your String is :"+name);
    }
}
