public class Weather {
    protected String condition;

    public Weather(String condition) {
        this.condition = condition;
        System.out.println("Weather created: " + condition);
    }

    public void showWeather() {
        System.out.println("General weather condition: " + condition);
    }
}