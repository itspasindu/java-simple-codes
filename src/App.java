import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //String normal, deluxe, luxury;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name : ");
       // String name = scanner.nextLine();

        System.out.print("Please enter your contact number : ");
        long contactNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter yout ID number : ");
        String idNum = scanner.nextLine();

        System.out.println("Room Prices - normal=5000, deluxe = 7500, luxury = 10000");
        System.out.print("Select your room type - ");
        String roomType = scanner.nextLine();

        System.out.print("Select number of nights : ");
        int numNights = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Number of persons : ");
        int numPersons = scanner.nextInt();
        scanner.nextLine();

        if (numPersons >= 5){
            System.out.println("Maximum 3 persons for 1 room");
            System.exit(0);
        }

        int roomPrice=0, totalCost=0;


        if (roomType.equalsIgnoreCase("normal")){
            roomPrice = 5000;
            totalCost = (roomPrice*numNights);
            System.out.println("Total bill amount is = "+totalCost);
        }

        else if (roomType.equalsIgnoreCase("deluxe")){
            roomPrice = 7500;
            totalCost = (roomPrice*numNights);
            System.out.println("Total bill amount is = "+totalCost);
        }

        else if (roomType.equalsIgnoreCase("luxury")){
            roomPrice = 10000;
            totalCost = (roomPrice*numNights);
            System.out.println("Total bill amount is = "+totalCost);
        }

        else {
            System.out.println("Please enter valid room type");
        }



        /*System.out.println("Customer name is "+name);
        System.out.println(name + " Contact number is " + contactNum);
        System.out.println(name + " ID number is " + idNum);*/
    }
}
