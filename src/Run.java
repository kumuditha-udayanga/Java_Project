import java.util.Scanner;

public class Run {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {

        System.out.println("Ayubovan welcome to Commercial Bank");
        System.out.println("Insructions : Enter the number of the service you want Access");
        System.out.println("1. Create a new Account");
        System.out.println("2. Login");
        System.out.print("Input your choice here : ");
        int choice = sc.nextInt();
        if (sc.hasNextInt()) {
            switch (choice) {
                case 1:
                    //iui
                    break;
                case 2:
                    //
                    break;
                default:
                    System.out.println("Invalid Operation");
                    displayMenu();
            }


        } else {
            System.out.println("Please read the instructions");
            displayMenu();
        }

    }

    public static void createAccount(){

        System.out.print("Enter Name :");
        String name = sc.nextLine();
        System.out.print("Enter Pin :");
        int pin = sc.nextInt();

    }
}
