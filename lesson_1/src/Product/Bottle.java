package Product;

public class Bottle extends Product{
    private int volume;
    public Bottle(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }
}
