import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Donor donor=new Donor();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        donor.setName(sc.nextLine());
        System.out.println("Enter Date of Birth :");
        donor.setDateOfBirth(sc.nextLine());
        System.out.println("Enter Gender :");
        donor.setGender(sc.nextLine());
        System.out.println("Enter Mobile Number :");
        donor.setMobileNumber(sc.nextLine());
        System.out.println("Enter Blood Group :");
        donor.setBloodGroup(sc.nextLine());
        System.out.println("Enter Blood Bank Name :");
        donor.setBloodBankName(sc.nextLine());
        System.out.println("Enter Donor Type :");
        donor.setDonorType(sc.nextLine());
        System.out.println("Enter Donation Date :");
        donor.setDonationDate(sc.nextLine());
        donor.displayDonationDetails();

    }
}