package java.seminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar.IMenuComponent;
import seminar.Menu;
import seminar.MenuItem;

public class MenuTest {
    private Menu menu;
    private IMenuComponent component;

    @BeforeEach
    void setup() {
        menu = new Menu();
        component = new MenuItem();
    }

    @Test
    void testAddIMenuComponent() {
        Assertions.assertTrue(menu.add(component));
        Assertions.assertTrue(menu.contains(component));
    }

    @Test
    void testRemoveIMenuComponent() {

        Assertions.assertTrue(menu.remove(component));
    }

}
