package Library;

import java.util.Scanner;

public class LaunchLibrarySystem {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MainSystemLibrary library = new MainSystemLibrary();

    //feel free to change any part of this code
    //NB: this code is incomplete. It's just to give you a quick start on the main menu of the library.
    public static void main(String[] args) throws Exception
    {

        
        while (true)
        {
            System.out.println("Library of the Mystic Arts Management System:");
            System.out.println("1. Register a Sorcerer");
            System.out.println("2. Catalogue a Tome");
            System.out.println("3. Display All Tomes");
            System.out.println("4. Search for a Tome");
            System.out.println("5. Lend Out a Tome");
            System.out.println("6. Return a Tome");
            System.out.println("7. Display Borrowed Tomes");
            System.out.println("8. List Tomes Held by a Sorcerer (Bonus)");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Sling Ring ID: ");
                    String sorcererId = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String sorcererName = scanner.nextLine();
                    System.out.print("Enter home sanctum (Kamar-Taj, New York, London, Hong Kong): ");
                    String sanctum = scanner.nextLine();
                    library.addSorcerer(sorcererId, sorcererName, sanctum);
                    //logic to register the sorcerer here.
                    //you can for example call a function or some function within a class, etc.
                    break;
                case 2:
                    System.out.print("Enter VCN (13 digits): ");
                    String vcn = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addTome(vcn, title, author);
                    //logic to catalogue the tome here.
                    break;
                case 3:
                    library.printTomes();
                    //call some function here to display all tomes.
                    break;
                case 4:
                    System.out.print("Enter VCN to search for: ");
                    String searchVcn = scanner.nextLine();
                    library.printSearchTomes(searchVcn);
                    //toString.printTomes();
                    //call some function here to search for the tome.
                    break;
                case 5:
                    System.out.print("Enter VCN of the tome to lend: ");
                    String lendVcn = scanner.nextLine();
                    System.out.print("Enter Sling Ring ID of the borrower: ");
                    String borrowerId = scanner.nextLine();
                    library.lendATome(lendVcn, borrowerId);
                    //call some function here to lend out the tome.
                    break;
                case 6:
                    System.out.print("Enter VCN of the tome being returned: ");
                    String returnVcn = scanner.nextLine();
                    library.returnTome(returnVcn);
                    //call some function here to return the tome.
                    break;
                case 7:
                    library.whichBooksBorrowed();
                    //call some function here to display borrowed tomes.
                    break;
                case 8:
                    System.out.print("Enter Sling Ring ID: ");
                    String holderId = scanner.nextLine();
                    //call some function here to list tomes held by this sorcerer.
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



