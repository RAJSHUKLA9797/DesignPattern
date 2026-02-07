package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private int temperature;
    private int humidity;
    private int pressure;
    private List<Observer> observerList;

    public WeatherData(){
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(int temperature,int humidity,int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public int getTemperature(){
        return this.temperature;
    }
    public int getPressure(){
        return this.pressure;
    }
    public int getHumidity(){
        return this.humidity;
    }
}
