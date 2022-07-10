public class Money {
    private final int _floor;
    private final int _pennies;

    public int GetFloor() {
        return _floor;
    }

    public int GetPennies() {
        return _pennies;
    }

    public int GetAllPennies() {
        return _pennies;
    }

    public Money(int pennies) {

        _floor = pennies / 100;
        _pennies = pennies % 100;


    }

    public Money(int floor, int pennies) {

        _floor = floor + pennies / 100;
        _pennies = pennies % 100;
    }

    public Money AddMoney(Money money) {
        var pennies = _pennies + money.GetPennies();
        var floor = _floor + money.GetFloor() + pennies / 100;
        pennies = pennies % 100;

        return new Money(floor, pennies);
    }

    public Money SubtractMoney(Money money) {
        return new Money(
                Math.max(_floor - money.GetFloor(), 0),
                Math.max(_pennies - money.GetPennies(), 0)
        );
    }


    @Override
    public String toString() {
        return _floor + "," + _pennies;
    }
}
