class Person {
    private String name;
    private int age;
    private String email;

    // Конструктор с проверкой данных
    public Person(String name, int age, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        this.email = email;
    }

    // Метод introduce
    public void introduce() {
        System.out.printf("Hi, my name is %s, I am %d years old.%n", name, age);
    }
}

class BankAccount {
    private double balance;

    // Конструктор
    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.balance = initialBalance;
    }

    // Метод пополнения счета
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        balance += amount;
    }

    // Метод снятия средств
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    // Геттер для баланса
    public double getBalance() {
        return balance;
    }
}

public class OopHomework {
    public static void main(String[] args) {
        // Создание объекта Person
        try {
            Person person = new Person("Vasiliy", 26, "example@example.com");
            person.introduce();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error creating Person: " + e.getMessage());
        }

        // Создание объекта BankAccount
        try {
            BankAccount bankAccount = new BankAccount("123456789", 100.0);
            bankAccount.deposit(12.5);
            bankAccount.withdraw(10);
            System.out.printf("Current balance: $%.2f%n", bankAccount.getBalance());
        } catch (Exception e) {
            System.out.println("Error with BankAccount: " + e.getMessage());
        }
    }
}