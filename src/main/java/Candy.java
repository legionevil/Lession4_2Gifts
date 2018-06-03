/**
 * Created by legionevil on 02.06.2018.
 */
public class Candy {
    private String name;
    private double weight;
    private double price;
    private String unique;

    public Candy() {
        String names [] = {"Степ", "Коровка", "Маска", "Белочка", "Москвичка", "Барбарис", "Цитрон", "Ласточка", "Мятная", "Дюшес"};
        double weights [] = {17, 12, 11.5, 8, 11, 5, 4.5, 10, 4.2, 3.6};
        double prices [] = {7.65, 8.33, 13.30, 17.1, 9.79, 6.84, 9.33, 10.2, 6.68, 6.69};
        String uniques[] = {"33S3299", "33A3300", "33D3301", "33B3304", "33C3305", "33F3306", "33H3307", "33N3308", "33K3309", "33Q3310"};
        int rndInd = (int) (Math.random() * names.length);
        this.name = names[rndInd];
        this.weight = weights[rndInd];
        this.price = prices[rndInd];
        this.unique = uniques[rndInd];
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public String getUnique() {
        return unique;
    }
}
