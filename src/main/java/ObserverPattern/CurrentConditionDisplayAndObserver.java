package ObserverPattern;

public class CurrentConditionDisplayAndObserver implements DisplayElement,Observer{
    private int temperature;
    private int humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplayAndObserver(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // first we build the CurrentConditionDisplaAndObserver , then we register it in WeateherData Subjects list as an observer,
    }
    @Override
    public void display() {
        System.out.println("Temperature is: "+temperature + "and humidity is: " + humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
