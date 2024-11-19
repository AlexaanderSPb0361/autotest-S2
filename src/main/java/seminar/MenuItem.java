package seminar;

public class MenuItem implements IMenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public MenuItem() {
    }

    @Override
    public boolean add(IMenuComponent component) {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(IMenuComponent component) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "-" + name);
    }

    @Override
    public boolean contains(IMenuComponent component) {
        return false;
    }
}
