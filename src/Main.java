import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Library = true;

        while (Library) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose Option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = scanner.next();
                    if (studentNIM.length() >= 15 && "202310370311376".equals(studentNIM)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your Username (Admin): ");
                    String Username = scanner.next();
                    System.out.print("Enter your Password (Admin): ");
                    String Password = scanner.next();
                    if (Username.equals("Nataaa") && Password.equals("Nataaa123")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    Library = false;
                    System.out.println("Thank You...");
                    break;
                default:
                    System.out.println("Option Not Avalible");
            }
        }

        scanner.close();
    }
}