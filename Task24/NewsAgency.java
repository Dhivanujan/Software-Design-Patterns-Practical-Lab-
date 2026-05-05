package Task24;

import java.util.*;

class NewsAgency {
    private List<NewsSubscriber> subscribers = new ArrayList<>();

    public void subscribe(NewsSubscriber s) {
        subscribers.add(s);
    }

    public void publishNews(String news) {
        for (NewsSubscriber s : subscribers) {
            s.update(news);
        }
    }
}
