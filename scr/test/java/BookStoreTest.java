import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookStoreTest {

    @Test
    public void testAddition() {
        BookStore store = new BookStore();

        assertEquals(30, store.add(10, 20));
    }
}
