import java.util.Arrays;
import java.util.Scanner;

public class DemoOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = new String();
        inputString = sc.nextLine();
        System.out.print("index: ");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars: ");
        for( int j = 0; j < inputString.length(); j++){
            System.out.print(inputString.charAt(j) + "\t");
        }
        }

    }
