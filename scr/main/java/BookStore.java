public class BookStore {

    public String getMessage() {
        return "Welcome to Online Book Store";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        BookStore store = new BookStore();

        System.out.println(store.getMessage());
        System.out.println("Total: " + store.add(10, 20));
    }
}
