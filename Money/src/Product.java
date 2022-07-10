public class Product {

    private final String _name;
    private Money _price;
    private int _quantity;
    private int _percentDiscount;

    public String GetName() {
        return _name;
    }

    public Money GetPrice() {
        if (GetPercentDiscount() != 0){
            var pennies = _price.GetPennies() + _price.GetFloor() * 100;
            pennies = pennies - ((pennies / 100) * GetPercentDiscount());
            return new Money(pennies);
        }
        else{
            return _price;
        }

    }

    public int GetQuantity() {
        return _quantity;
    }
    public int GetPercentDiscount() {
        return _percentDiscount;
    }

    public void SetPercentDiscount(int percent) {
        _percentDiscount = percent;
    }

    public Product(String name, Money price, int quantity) {
        _name = name;
        _price = price;
        _quantity = quantity;
        _percentDiscount = 0;
    }

    public void RaisePrice(Money money) {
        _price = _price.AddMoney(money);
    }

    public void ReducePrice(Money money) {
        _price = _price.SubtractMoney(money);
    }

    public void IncreaseQuantityProduct(int quantity){
        _quantity += quantity;
    }
    public void ReduceQuantityProduct(int quantity){
        _quantity = Math.max(_quantity - quantity, 0);
    }

    @Override
    public String toString() {
        return "Name: " + GetName() + "; Price: " + GetPrice()+ "; Quantity: " + GetQuantity() + "; ";
    }
}

