package seminar;

public interface IMenuComponent {
    void display(int depth);

    boolean add(IMenuComponent component);

    boolean remove(IMenuComponent component);

    boolean contains(IMenuComponent component);
}
