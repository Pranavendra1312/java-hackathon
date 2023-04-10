import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemType itemtype=new ItemType();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type name");
        itemtype.setName(sc.nextLine());
        System.out.println("Enter the cost per day");
        itemtype.setCostPerDay(sc.nextDouble());
        System.out.println("Enter the deposit");
        itemtype.setDeposit(sc.nextDouble());
        itemtype.display();
    }
}