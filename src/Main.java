import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 5;
        String allNames = " ";
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Please Input 5 Numbers - " + i);
            String name = scanner.nextLine();
            allNames += name + " ";
        }

        System.out.println("All names - " + allNames);
    }
}