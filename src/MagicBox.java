import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected Random random;

    public MagicBox(int maxObj) {
        items = (T[]) new Object[maxObj];
        random = new Random();
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (T obj : items) {
            if (obj == null) {
                int needToAdd = getNumberOfEmptyCells();
                throw new RuntimeException("Коробка не полна, осталось заполнить еще " + needToAdd + " ячеек");
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    public int getNumberOfEmptyCells() {
        int numberOfEmptyCells = 0;
        for (T obj : items) {
            if (obj == null) {
                numberOfEmptyCells++;
            }
        }
        return numberOfEmptyCells;
    }

    @Override
    public String toString() {
        String str = "";
        for (T obj : items) {
            str += obj + " ";
        }
        return str;
    }
}
