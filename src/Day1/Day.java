package Day1;
import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day=sc.next().toLowerCase().trim();
        sc.nextLine();
        if(day.equals("saturday")||day.equals("sunday")){
            System.out.println("weekend");
        }else if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")){
            System.out.println("weekday");
        }else {
            System.out.println("Invalid");
        }
    }
}
