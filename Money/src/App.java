public class App {
    public static void main(String[] args) {
        Money money = new Money(5,50);
        money.AddMoney(new Money(10, 95));
        money.SubtractMoney(new Money(10, 50));

        Product smartphone = new Product("Google Pixel 5a", new Money(560, 0), 20);

        System.out.println(smartphone);
        System.out.println("Discount 50%");
        smartphone.SetPercentDiscount(50);
        System.out.println(smartphone);
    }
}
