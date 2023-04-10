import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        if(n<1)
        {
          System.out.println("Count is less than Min Count");
          return;
        }
        if(n>4)
        {
          System.out.println("Count is more than Max Count");
          return;
        }
        int intArr[] = new int[n];
        String strArr[] = new String[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter strings:");
        
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }
        sc.close();
        //Printing out outputs
        System.out.println("Displaying numbers");
        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println("Displaying strings");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}