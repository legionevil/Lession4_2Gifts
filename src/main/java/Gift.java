/**
 * Created by legionevil on 02.06.2018.
 */
public class Gift {
    Candy candy1 = new Candy();
    Candy candy2 = new Candy();
    Candy candy3 = new Candy();
    Candy candy4 = new Candy();
    Candy candy5 = new Candy();
    Gum gum = new Gum();
    Chocolate chocolate = new Chocolate();

    private double totalWeight = candy1.getWeight() + candy2.getWeight() + candy3.getWeight() + candy4.getWeight() + candy5.getWeight() + gum.getWeight() + chocolate.getWeight();
    private double totalPrice =  candy1.getPrice() + candy2.getPrice() + candy3.getPrice() + candy4.getPrice() + candy5.getPrice() + gum.getPrice() + chocolate.getPrice();

    public double getTotalWeight() {
        return totalWeight;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
