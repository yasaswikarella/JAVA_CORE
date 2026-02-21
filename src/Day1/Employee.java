package Day1;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        int empId = sc.nextInt();
        System.out.println("Enter employee name : ");
        String empN = sc.next();
        sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        if(age<21){
            System.out.println("underage");
        }
        System.out.println("Enter choice : 1-IT 2-HR 3-Finance");
        int choice = sc.nextInt();
        String dep = " ";
        String role = " ";
        int allowance = 0;
        switch(choice){
            case 1:
                dep = "It";
                System.out.println("Enter choice : 1-Developer 2-Tester");
                int cit = sc.nextInt();
                switch (cit){
                    case 1:
                        role="Developer";
                        allowance=25;
                        break;
                    case 2:
                        role="Tester";
                        allowance= 24;
                        break;
                    default:
                        System.out.println("Not applicable");
                }
                break;
            case 2:
                dep ="HR";
                System.out.println("Enter choice : 1-Recruiter 2-Payroll");
                int chr = sc.nextInt();
                switch (chr){
                    case 1:
                        role="Recruiter";
                        allowance=30;
                        break;
                    case 2:
                        role="Payroll";
                        allowance=28;
                        break;
                    default:
                        System.out.println("Not applicable");
                }
                break;
            case 3:
                dep="Finance";
                System.out.println("Enter choice : 1-accountant 2-auditor");
                int cFin= sc.nextInt();
                switch (cFin){
                    case 1:
                        role="accountant";
                        allowance=20;
                        break;
                    case 2:
                        role="auditor";
                        allowance=15;
                        break;
                    default:
                        System.out.println("Not applicable");
                }
                break;
            default:
                System.out.println("not in choice");
        }
        System.out.print("Enter basic salary : ");
        double basicSal = sc.nextDouble();
        double finalSal = basicSal + (basicSal*allowance/100);

        String access = "";

        if(finalSal>=60000 && dep.equals("IT"))
        {
            access="Admin access";
        }else if(finalSal>=60000 && !(dep.equals("IT")))
        {
            access="Manager access";
        }else {
            access="Manager access";
        }


        System.out.println("Details of the employee: ");
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empN);
        System.out.println("Employee age : "+age);
        System.out.println("Employee Department : "+dep);
        System.out.println("Employee Role : "+role);
        System.out.println("Employee Basic Salary : "+basicSal);
        System.out.println("Employee Final Salary : "+finalSal);
        System.out.println("Employee Access Level : "+access);

    }
}
