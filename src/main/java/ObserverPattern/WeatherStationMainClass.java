package ObserverPattern;

public class WeatherStationMainClass {
    public static void main (String args[]){
        WeatherData weatherData = new WeatherData(); // this is the subject


        //this is the observer
        CurrentConditionDisplayAndObserver currentConditionDisplayAndObserver = new CurrentConditionDisplayAndObserver(weatherData);

        // now from main we will only call weatherData Subject we will call setMeasurements and it will get updated in observer aswell
        weatherData.setMeasurements(34,98,100);
        //Output: Temperature is: 34and humidity is: 100
    }
}
