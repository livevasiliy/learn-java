import java.util.ArrayList;

public class ArrayListHomework {

    // Метод для добавления студента
    public static void addStudent(ArrayList<String> students, String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        students.add(name);
        System.out.println(name + " was added to the list.");
    }

    // Метод для удаления студента
    public static void removeStudent(ArrayList<String> students, String name) {
        if (!students.contains(name)) {
            throw new IllegalArgumentException("Student " + name + " not found in the list.");
        }
        students.remove(name);
        System.out.println(name + " was removed from the list.");
    }

    // Метод для поиска студента
    public static boolean findStudent(ArrayList<String> students, String name) {
        if (students.contains(name)) {
            System.out.println(name + " was found in the list.");
            return true;
        } else {
            System.out.println(name + " was not found in the list.");
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        try {
            // Добавление студентов
            addStudent(students, "Alice");
            addStudent(students, "Bob");
            addStudent(students, "Carl");

            // Вывод списка студентов
            System.out.println("Current list: " + students);

            // Удаление студента
            removeStudent(students, "Bob");

            // Поиск студента
            findStudent(students, "Alice");
            findStudent(students, "Bob"); // Попытка найти удаленного студента

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}