/**
 * Created by legionevil on 02.06.2018.
 */
public class Gum {
    private String name;
    private double weight;
    private double price;
    private String unique;

    public Gum() {
        String names [] = {"Ментос", "Орбит", "Дирол", "Даблминт", "Циклон"};
        double weights [] = {54, 30, 13.6, 40.5, 31.2};
        double prices [] = {102, 49.90, 26.50, 172, 64};
        String uniques[] = {"32S3299", "32A3300", "32D3301", "32B3304", "32C3305"};
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
