package Observer.Task24;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        agency.subscribe(new Reader("John"));
        agency.subscribe(new Reader("Emma"));

        agency.publishNews("Breaking News: New Technology Released!");
    }
}
