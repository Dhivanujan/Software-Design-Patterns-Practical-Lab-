package Task23;

import java.util.*;

class Stock {
    private List<Investor> investors = new ArrayList<>();

    public void addInvestor(Investor i) {
        investors.add(i);
    }

    public void setPrice(double price) {
        for (Investor i : investors) {
            i.update(price);
        }
    }
}
