package phonebook;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        PhoneBook phoneBook = new PhoneBook();

	        while (true) {
	            System.out.println("\n--- Phonebook Menu ---");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Update Contact");
	            System.out.println("3. Delete Contact");
	            System.out.println("4. View All Contacts");
	            System.out.println("5. Search Contact");
	            System.out.println("6. Exit");
	            System.out.print("Choose option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Phone: ");
	                    String phone = scanner.nextLine();
	                    System.out.print("Enter Email: ");
	                    String email = scanner.nextLine();
	                    phoneBook.addContact(new Contact(name, phone, email));
	                    break;

	                case 2:
	                    System.out.print("Enter Phone to update: ");
	                    phone = scanner.nextLine();
	                    System.out.print("Enter New Name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter New Email: ");
	                    email = scanner.nextLine();
	                    phoneBook.updateContact(phone, name, email);
	                    break;

	                case 3:
	                    System.out.print("Enter Phone to delete: ");
	                    phone = scanner.nextLine();
	                    phoneBook.deleteContact(phone);
	                    break;

	                case 4:
	                    phoneBook.viewAllContacts();
	                    break;

	                case 5:
	                    System.out.print("Enter Name to search: ");
	                    name = scanner.nextLine();
	                    phoneBook.searchByName(name);
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
