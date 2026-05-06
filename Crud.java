import java.util.ArrayList;

public class Main {

    static ArrayList<String> users = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE
        users.add("John");
        users.add("Alice");

        // READ
        System.out.println("All Users: " + users);

        // UPDATE
        users.set(1, "Alicia");

        System.out.println("After Update: " + users);

        // DELETE
        users.remove("John");

        System.out.println("After Delete: " + users);
    }
}
