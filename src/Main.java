public class Main {

    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(4);
        box1.add("Стол");
        box1.add("Стул");
        box1.add("Шкаф");
        box1.add("Кровать");
        System.out.println("Список: " + box1);
        System.out.println("Получилось ли добавить еще один объект? " + box1.add("Диван"));
        System.out.println("Случайный объект: " + box1.pick());

        System.out.println();

        MagicBox<Integer> box2 = new MagicBox<>(4);
        box2.add(new Integer(45));
        box2.add(new Integer(65));
        box2.add(new Integer(46));
        System.out.println("Список: " + box2);
        System.out.println("Случайный объект: " + box2.pick());
    }
}
