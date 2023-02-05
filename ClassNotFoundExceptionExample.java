public class ClassNotFoundExceptionExample {
    public static void main(String args[]) {
        try {
            Class x = Class.forName("UE");
            System.out.println("Specified Class " + x + " found successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry, below specified class is not found");
        }
    }
}
