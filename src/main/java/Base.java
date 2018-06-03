import java.util.Locale;

/**
 * Created by legionevil on 27.05.2018.
 * @version 1.01
 */
public class Base {
    public static void main(String[] args) {
        System.out.println("Собиралка новогодних подарков!");
        Gift gift = new Gift();
        System.out.println("Наш подарок состоит из:");
        //неплохо было бы коллекции объектов изучить...
        System.out.println("- Конфета " + gift.candy1.getName() + ", вес " + gift.candy1.getWeight() + "гр., цена " + gift.candy1.getPrice() + "р., артикул " + gift.candy1.getUnique() + ";");
        System.out.println("- Конфета " + gift.candy2.getName() + ", вес " + gift.candy2.getWeight() + "гр., цена " + gift.candy2.getPrice() + "р., артикул " + gift.candy2.getUnique() + ";");
        System.out.println("- Конфета " + gift.candy3.getName() + ", вес " + gift.candy3.getWeight() + "гр., цена " + gift.candy3.getPrice() + "р., артикул " + gift.candy3.getUnique() + ";");
        System.out.println("- Конфета " + gift.candy4.getName() + ", вес " + gift.candy4.getWeight() + "гр., цена " + gift.candy4.getPrice() + "р., артикул " + gift.candy4.getUnique() + ";");
        System.out.println("- Конфета " + gift.candy5.getName() + ", вес " + gift.candy5.getWeight() + "гр., цена " + gift.candy5.getPrice() + "р., артикул " + gift.candy5.getUnique() + ";");
        System.out.println("- Жевачка " + gift.gum.getName() + ", вес " + gift.gum.getWeight() + "гр., цена " + gift.gum.getPrice() + "р., артикул " + gift.gum.getUnique() + ";");
        System.out.println("- Шоколад " + gift.chocolate.getName() + ", вес " + gift.chocolate.getWeight() + "гр., цена " + gift.chocolate.getPrice() + "р., артикул " + gift.chocolate.getUnique() + ".");
        System.out.println("Вес подарка - " + String.format(Locale.ENGLISH,"%.2f", gift.getTotalWeight()) + "гр.");
        System.out.println("Цена подарка - " + String.format(Locale.ENGLISH,"%.2f", gift.getTotalPrice()) + "руб.");
    }
}
