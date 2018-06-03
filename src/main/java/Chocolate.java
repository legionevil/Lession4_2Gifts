/**
 * Created by legionevil on 02.06.2018.
 */
public class Chocolate {
    private String name;
    private double weight;
    private double price;
    private String unique;

    public Chocolate() {
        String names [] = {"Аленка", "КитКат", "Киндер", "Вдохновение", "Милка", "Линдт", "Слава", "Российский", "Орео", "Яшкино"};
        double weights [] = {100, 94, 100, 100, 90, 100, 75, 90, 95, 90};
        double prices [] = {75.7, 84.2, 84.1, 84.6, 94.1, 189, 98.8, 69.7, 62.2, 55.3};
        String uniques[] = {"35S3299", "35A3300", "35D3301", "35B3304", "35C3305", "35F3306", "35H3307", "35N3308", "35K3309", "35Q3310"};
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
