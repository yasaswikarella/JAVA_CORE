package Day0;

import java.util.Scanner;

public class Methodz {
    public static void main(String[] args) {
        //evenOdd();
        //divisibleBy7();
        //divisibleBy3Or5();
        //isVowel();
        //iDigit();
        //whichChar();
        //pass();
        //check();
        //checkNum();
        //max();
        min();
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
    //4
    public static void isVowel(){
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.next().toUpperCase().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("vowel");
        }else {
            System.out.println("consonent");
        }
    }
    //5
    public static void iDigit(){
        Scanner sc=new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>='0' && c<='9'){
            System.out.println("Digit");
        }else {
            System.out.println("not");
        }
    }
    //6
    public static void whichChar(){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("Uppercase");
        } else if (ch>='0' && ch<='9') {
            System.out.println("Digit");
        }else {
            System.out.println("Spcl char");
        }
    }
    //7
    public static void pass(){
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks<=100 && marks>=90) System.out.println("A");
        else if (marks<=89 && marks>=75) System.out.println("B");
        else if (marks<=74 && marks >= 65) System.out.println("C");
        else if (marks<=64 && marks>=55) System.out.println("D");
        else if(marks<55) System.out.println("Fail");
        else System.out.println("Invalid");
    }
    //8
    public static void check(){
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("lower vowel");
            }else{
                System.out.println("lower consonant");
            }
        }else if(ch>='A' && ch<='Z'){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("upper vowel");
            }else{
                System.out.println("upper consonant");
            }
        }else {
            System.out.println("not an alphabet");
        }
    }
    //9
    public static void checkNum(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n<0) System.out.println("negative");
        else if(n>0) System.out.println("positive");
        else System.out.println("Zero");
    }
    //10
    public static void max(){
        int a=9,b=8,c=4;
        if(a>b) {
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }else {
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
    }
    //11
    public static void min(){
        int a=9 ,b=4, c=2;
        if (a<b){
            if(a<c) System.out.println(a);
            else System.out.println(c);
        }else {
            if(b<c) System.out.println(b);
            else System.out.println(c);
        }
    }

}
