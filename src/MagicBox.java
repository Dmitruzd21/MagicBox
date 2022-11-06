import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    Random random = new Random();

    public MagicBox(int maxObj) {
        items = (T[]) new Object[maxObj];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() {
        for (T obj : items) {
            if (obj == null) {
                int needToAdd = getNumberOfEmptyCells();
                String message = "Коробка не полна, осталось заполнить еще " + needToAdd + " ячеек";
                throw new RuntimeException(message);
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    int getNumberOfEmptyCells() {
        int numberOfEmptyCells = 0;
        for (T obj : items) {
            if (obj == null) {
                numberOfEmptyCells++;
            }
        }
        return numberOfEmptyCells;
    }

    public String toString() {
        String str = "";
        for (T obj : items) {
            str += obj + " ";
        }
        return str;
    }
}
