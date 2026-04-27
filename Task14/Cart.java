package Task14;
import java.util.List;
import java.util.ArrayList;

class Cart implements CartItem {
    private List<CartItem> items = new ArrayList<>();

    public void add(CartItem item) {
        items.add(item);
    }

    public double getPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
