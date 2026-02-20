package Day0;

import java.util.Scanner;

public class Methodz {
    public static void main(String[] args) {
        //evenOdd();
        //divisibleBy7();
        divisibleBy3Or5();
    }
    //1
    public static void evenOdd(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
    //2
    public static void divisibleBy7(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%7==0) System.out.println("Dilvisible by 7");
        else System.out.println("Not Divisible by 7");
    }
    //3
    public static void divisibleBy3Or5(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Both");
        } else if (n%3==0 ) {
            System.out.println("3");
        } else if (n%5==0) {
            System.out.println("5");
        }else {
            System.out.println("none");
        }
    }
}
