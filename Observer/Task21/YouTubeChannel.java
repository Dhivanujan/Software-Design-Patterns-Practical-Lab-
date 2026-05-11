package Observer.Task21;

import java.util.*;

class YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void uploadVideo(String title) {
        System.out.println("New Video Uploaded: " + title);

        for (Subscriber s : subscribers) {
            s.update(title);
        }
    }
}
