public class Product implements IpadInterface{
    private IpadInterface Ipad;

    public Product(IpadInterface Ipad) {
        this.Ipad = Ipad;
    }

    public double computePrice() {
        return Ipad.computePrice();
    }


    public String toString() {
        return Ipad + " has " + "GB memory,  and costs $" + computePrice();
    }

    public static void main(String[] args) {
        Product bigPro = new Product(new BigIpad(256));
        Product pro = new Product(new MidIpad(64));
        Product iPad = new Product(new SmallIpad(24));

        System.out.println(bigPro + "\n" + pro + "\n" +
                iPad + "\n"
        );

    }
}