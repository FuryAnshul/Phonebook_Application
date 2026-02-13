
📞 PhoneBook Application (Core Java + Streams)

📌 Overview

This is a CLI-based PhoneBook application built using Core Java (no frameworks).
It allows users to add, update, delete, view and search contacts.

The project demonstrates clean code practices, object-oriented design, and use of Java 8 Streams.

🚀 Features

Add a new contact

Update existing contact

Delete contact

View all contacts

Search contact by name

Duplicate phone number validation

🛠️ Tech Stack

Java 8+

ArrayList (in-memory storage)

Java Streams API

--------------------------------------------------------------------

▶️ Instructions to Run the Program

1️⃣ Clone the Repository

git clone https://github.com/your-username/Phonebook_Application.git
cd Phonebook_Application

🔹 2️⃣ Navigate to Source Directory
cd src

🔹 3️⃣ Compile the Program

If your package is: package phonebook;


Run: javac phonebook/*.java

🔹 4️⃣ Run the Program

java phonebook.Main

💡 Running via IDE

If using Eclipse / IntelliJ:

Import project

Right-click on Main.java

Click Run As → Java Application


📌 Expected Output

The program will display a CLI menu:

--- Phonebook Menu ---
1. Add Contact
2. Update Contact
3. Delete Contact
4. View All Contacts
5. Search Contact
6. Exit

------------------------------------------------

🧠 Key Design Decisions and Assumptions

CLI (Command Line Interface)

1️⃣ CLI-Based Architecture

The application is implemented as a Command Line Interface (CLI) program to keep the solution simple and aligned with the test requirement (no REST APIs or frameworks).

2️⃣ Object-Oriented Design

The project follows OOP principles:

Contact → Represents the data model (entity).

PhoneBook → Contains business logic (add, update, delete, search).

Main → Handles user interaction.

This ensures separation of concerns and improves maintainability.


⚙️ Assumptions

User inputs valid phone numbers and emails

No external database required

Designed for demonstration / backend assessment purposes

Not optimized for very large datasets

-------------------------------------------------------------------

💾 Details of Data Storage

📌 Storage Type: In-Memory

This application uses in-memory storage to manage contacts.

All contacts are stored in:

List<Contact> contacts = new ArrayList<>();

🔹 How It Works

When a contact is added, it is stored inside an ArrayList.

All operations (add, update, delete, search) are performed on this list.

The data exists only during program execution.

🔹 Important Behavior

Data is not persisted.

When the application stops, all stored contacts are lost.

Restarting the program creates a fresh empty phonebook.

🔹 Why In-Memory Storage Was Chosen

Keeps the application simple and lightweight.

Meets the assessment requirement (no database needed).

Suitable for small datasets.

Avoids external dependencies.
