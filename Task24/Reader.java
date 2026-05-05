package Task24;

class Reader implements NewsSubscriber {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
