import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {
    @Test
    public void testAppend() {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(4);
        assertEquals(list1.root.next.next.value, 4);
    }
  





}