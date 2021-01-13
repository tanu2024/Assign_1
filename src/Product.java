public class Product {
    String productName;
    double price;
    int quantity;
    String type;

    Product(String productName, String type, double price, int quantity) {
        this.productName = productName;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    void Productmethod() {
        if (type.equals("Raw")) {
            double salestax = ((12.5 * price) / 100);
            double finalprice = ((salestax + price)*quantity);
            System.out.println("Name:" + productName + "Price:" + price + "Sales tax liability:" + salestax +
                    "Final Price:" + finalprice);
        } else if (type.equals("Manufactured")) {
            double salestax = ((12.5 * price) / 100) + ((2 / 100) * (price + ((12.5 * price) / 100)));
            double finalprice = ((salestax + price)*quantity);
            System.out.println("Name:" + productName + "Price:" + price + "Sales tax liability:" + salestax +
                    "Final Price:" + finalprice);

        } else if (type.equals("Imported")) {
            double tax = ((10 * price) / 100);
            double finalcost = tax + price;
            if (finalcost <= 100) {
                finalcost = ((finalcost + 5)*quantity);
            } else if (finalcost > 100 && finalcost >= 200) {
                finalcost = ((finalcost + 10)*quantity);
            } else if (finalcost > 200) {
                finalcost = ((finalcost + ((5 / 100) * finalcost)*quantity));
            }
            System.out.println("Name:" + productName + "Price:" + price + "Sales tax liability:" + tax +
                    "Final Price:" + finalcost);

        }
    }
}
