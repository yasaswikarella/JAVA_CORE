package Day1;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().toUpperCase().charAt(0);
        switch (ch){
            case 'A':
                System.out.println("Excellent");
            break;
            case 'B':
                System.out.println("Good");
            break;
            case 'C':
                System.out.println("Above Average");
            break;
            case 'D':
                System.out.println("Average");
            break;
            case 'E':
                System.out.println("Below Average");
            break;
            case 'F':
                System.out.println("Fail");
            break;
            default:
                System.out.println("Invalid");
        }
    }
}
