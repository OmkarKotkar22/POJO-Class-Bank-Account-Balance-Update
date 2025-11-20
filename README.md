# 🏦 POJO Example: Bank Account Balance Update ✨

This repository demonstrates the fundamental Object-Oriented Programming (OOP) concept of using a **Plain Old Java Object (POJO)** to model a real-world entity and encapsulate its data. The example focuses on managing and updating a bank account balance.

---

### 📝 Key Concepts Demonstrated 🔑

* **POJO (`Bank_Account.java`):** A simple Java object used to hold data (the account balance, and perhaps account number/holder name). It typically contains only private fields, public getters, and public setters.
* **Encapsulation 🛡️:** The account balance data is made **private**, and access/modification is controlled solely through public methods (getters and setters), ensuring data integrity and security.
* **Object Instantiation 🆕:** Creating an instance of the `Bank_Account` POJO to represent a specific bank account.
* **Method Invocation 📞:** Calling methods like `deposit()` or `withdraw()` from the main class (`Bank_Balance_Update.java`) to manipulate the object's state safely.

---

### 📂 File Structure Overview 🗂️

The core logic of the program is split into two main files within the `src/Bank_Balance_Update` directory:

| File Name | Description | Role |
| :--- | :--- | :--- |
| `Bank_Account.java` | Defines the class structure for a bank account (balance, getters, setters). | **POJO/Data Model** 🧱 |
| `Bank_Balance_Update.java` | Contains the `main` method to instantiate the `Bank_Account` and demonstrate transactions (deposit/withdraw). | **Driver/Main Program** ⚙️ |

---

### 🚀 Getting Started

#### Prerequisites 🛠️

* **Java Development Kit (JDK 8+):** Ensure you have the JDK installed to compile and run Java programs.

#### Running the Code ▶️

1.  **Clone the Repository:**
    ```bash
    git clone [Your Repository URL]
    ```
2.  **Navigate to the source directory:**
    ```bash
    cd POJO-Class-Bank-Account-Balance-Update/src/Bank_Balance_Update
    ```
3.  **Compile the Java files:**
    ```bash
    javac Bank_Account.java Bank_Balance_Update.java
    ```
4.  **Execute the main class:**
    ```bash
    java Bank_Balance_Update
    ```
