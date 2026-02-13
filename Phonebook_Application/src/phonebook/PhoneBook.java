package phonebook;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.getPhone().equals(contact.getPhone()));

        if (exists) {
            System.out.println("Contact already exists!");
        } else {
            contacts.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    // Update Contact
    public void updateContact(String phone, String name, String email) {
        contacts.stream()
                .filter(c -> c.getPhone().equals(phone))
                .findFirst()
                .ifPresentOrElse(
                        c -> {
                            c.setName(name);
                            c.setEmail(email);
                            System.out.println("Contact updated!");
                        },
                        () -> System.out.println("Contact not found!")
                );
    }

    // Delete Contact
    public void deleteContact(String phone) {
        boolean removed = contacts.removeIf(c -> c.getPhone().equals(phone));

        if (removed) {
            System.out.println("Contact deleted!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    // View All
    public void viewAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        contacts.forEach(System.out::println);
    }

    // Search by Name
    public void searchByName(String name) {
        List<Contact> result = contacts.stream()
                .filter(c -> c.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("No matching contact found.");
        } else {
            result.forEach(System.out::println);
        }
    }
}
