package ObserverPattern;


//Here Basically There is a Subject(a Publisher) and Observer(a Listener). Both of these are interfaes, what we do is in Subjects interface,we have 3 methods(add,remove and notify the observer), and in observer we have a method update(), which gets called by notifyObserver of Subject
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
