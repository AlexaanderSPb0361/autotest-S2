package java.seminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar.MenuItem;

public class MenuItemTest {

    private MenuItem menuItem;

    @BeforeEach
    void setup() {
        menuItem = new MenuItem();
    }

    @Test
    void testAddIMenuComponent() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            menuItem.add(new MenuItem());
        });
    }

    @Test
    void testRemoveIMenuComponent() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            menuItem.remove(new MenuItem());
        });
    }
}



