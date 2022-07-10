import java.util.Random;

public class App {
    public static void main(String[] args) {

//        IntegersList integers = new IntegersList(List.of(10, 2, 6, 1, 0, 5, 9, 78));

        IntegersList integers = new IntegersList();
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            integers.add(generator.nextInt(100));
        }

        System.out.print("Not sort: ");
        System.out.println(integers);

        System.out.print("Sort L: ");
        integers.SortAsc();
        System.out.println(integers);

        System.out.print("Sort R: ");
        integers.SortDesc();
        System.out.println(integers);

        System.out.printf("Max: %d\n", integers.Max());
        System.out.printf("Min: %d\n", integers.Min());
        System.out.printf("Avg: %s\n", String.format("%.3f", integers.Avg()));


//        integers.addAll(List.of(10, 2, 6, 1, 0, 5, 9, 78));
//        System.out.println(integers);

    }
}
