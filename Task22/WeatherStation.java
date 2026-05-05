package Task22;

import java.util.*;

class WeatherStation {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setTemperature(float temp) {
        for (Observer o : observers) {
            o.update(temp);
        }
    }
}
