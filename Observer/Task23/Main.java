package Observer.Task23;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addInvestor(new UserInvestor("Alice"));
        stock.addInvestor(new UserInvestor("Bob"));

        stock.setPrice(150.75);
    }
}
