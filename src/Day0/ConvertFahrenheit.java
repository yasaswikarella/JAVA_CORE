package Day0;

import java.util.Scanner;

public class ConvertFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c= sc.nextDouble();
        double f=(c*9.0/5.0)+32;
        System.out.println(f);
    }
}

//package Day0;
//
//import java.util.Scanner;
//
//public class ConvertFahrenheit {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double f= sc.nextDouble();
//        double c=(f-32)*5.0/9.0;
//        System.out.println(c);
//    }
//}

