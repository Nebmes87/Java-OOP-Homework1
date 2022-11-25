import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<HotDrink> list1 = new ArrayList<HotDrink>();
        list1.add(new HotDrink("Кофе",80., 80, 0.2));
        list1.add(new HotDrink("Черный чай",35., 75,0.3));
        list1.add(new HotDrink("Какао",50., 65, 0.25));

        List<HotDrink> list2 = new ArrayList<HotDrink>();
        list2.add(new HotDrink("Горячий шоколад",75., 60, 0.3));
        list2.add(new HotDrink("Глинтвейн",100.,70,0.4));

        HotDrinkVendingMachine vendingMachine1 = new HotDrinkVendingMachine(list1);
        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine(list2);

        HotDrink searchProduct = vendingMachine1.GetProduct("Кофе");
        if (searchProduct != null) {
            System.out.println("Продукт найден: " + searchProduct.toString());
        }
        else {
            System.out.println("Такого продукта нет в этом вендинговом автомате!");
        }
        searchProduct = vendingMachine2.GetProduct("Кофе");
        if (searchProduct != null) {
            System.out.println("Продукт найден: " + searchProduct.toString());
        }
        else {
            System.out.println("Такого продукта нет в этом вендинговом автомате!");
        }
        HotDrink anotherSearchProduct = vendingMachine1.GetProduct("Какао", 65,0.25);
        if (anotherSearchProduct != null) {
            System.out.println("Продукт найден: " + anotherSearchProduct.toString());
        }
        else {
            System.out.println("Такого продукта нет в этом вендинговом автомате!");
        }
   }
}
