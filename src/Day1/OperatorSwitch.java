package Day1;

import java.util.Scanner;

public class OperatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation");
        String op = sc.nextLine().toLowerCase().trim();
        System.out.println("Enter number of values");
        int n= sc.nextInt();
        switch (op){
            case "addition":
                int add=0;
                for (int i=1;i<=n;i++){
                    add+= sc.nextInt();
                }
                System.out.println("Addition of "+n+" values is "+add);
            case "subtraction":
                int sub=0;

        }
    }
}
