package Day1;

import java.util.Scanner;

public class FruitSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        sc.nextLine();
        switch (fruit){
            case "apple":
                System.out.println("apples are rich in fibre and vitamin c");
                break;
            case "banana":
                System.out.println("Bananas are a great source of potassium");
                break;
            case "mango":
                System.out.println("Mangoes are the king of fruits");
                break;
            case "orange":
                System.out.println("Oranges are packed with vitamin c");
                break;
            default:
                System.out.println("Sorry, I dont have information about that fruit");
        }
    }
}
