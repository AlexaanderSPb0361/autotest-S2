package seminar;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenuComponent {
    private final List<IMenuComponent> components = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public Menu() {
    }

    @Override
    public boolean add(IMenuComponent component) {
        if (!components.contains(component)) {
            return false;
        }
        components.add(component);
        return true;
    }

    @Override
    public boolean remove(IMenuComponent component) {

        return components.remove(component);

    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "-" + name);
        for (IMenuComponent component : components) {
            component.display(depth + 2);
        }
    }

    @Override
    public boolean contains(IMenuComponent component) {
        return components.contains(component);
    }
}
