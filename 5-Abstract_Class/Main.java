import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter choice");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if(n!=1 && n!=2){
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Enter details in CSV format");

        String[] data = sc.nextLine().split(",");

        if(data.length!=6){
            System.out.println("Invalid input");
            return;
        }
        else {
            if (n == 1) {
                Exhibition event = new Exhibition(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), Double.parseDouble(data[5]));
                System.out.println("Exhibition Details");
                System.out.println("Event name : " + event.getName());
                System.out.println("Detail : " + event.detail);
                System.out.println("Type : " + event.getType());
                System.out.println("Organizer : " + event.getOrganizer());
                System.out.println("Total Cost : " + event.calculateAmount());


            }
            if (n == 2) {
                StageEvent event = new StageEvent(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), Double.parseDouble(data[5]));
                System.out.println("Stage Event Details");
                System.out.println("Event name : " + event.getName());
                System.out.println("Detail : " + event.detail);
                System.out.println("Type : " + event.getType());
                System.out.println("Organizer : " + event.getOrganizer());
                System.out.println("Total Cost : " + event.calculateAmount());
            }
        }
    }
}
