package Task23;

class UserInvestor implements Investor {
    private String name;

    public UserInvestor(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println(name + " notified: Stock price = " + price);
    }
}
