package lesson_4;

public class Payment {


    public static void main(String[] args) {
        Items[] item = new Items[2];
        item[0] = new Items("Oranges","Fruits",6.50,"TR",1.5);
        item[1] = new Items("Beef","Meat",18.50,"BY",1);
        Payment pay = new Payment("Green", item);
        pay.showPayInfo("Green",item);
    }

    protected String shopName;
    protected Items[] item;

    Payment(String shopName, Items[] item) {
        this.shopName = shopName;
        this.item = item;
    }

    // TODO: how to convert array to string
    // DONE.
    protected void showPayInfo(String shopName,Items[] item){
        this.shopName = shopName;
        this.item = item;
        System.out.println("Your order in the shop: " + shopName);
        for (Items items : item) {
            System.out.println
                    ("Item name: " + items.name + " Item type: " + items.type + " Item cost: " + items.cost + " Item country: " + items.country + " Item weight: " + items.weight);
        }
    }

    protected static class Items {
        public String name;
        public String type;
        public double cost;
        public final String country;
        public double weight;

        public Items(String name, String type, double cost, String country, double weight) {
            this.name = name;
            this.type = type;
            this.cost = cost;
            this.country = country;
            this.weight = weight;
        }
    }
}



