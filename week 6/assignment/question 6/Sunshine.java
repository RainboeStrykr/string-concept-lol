public class Sunshine extends Weather {
    private int temperature;

    public Sunshine(String condition, int temperature) {
        super(condition);
        this.temperature = temperature;
        System.out.println("Sunshine created with temperature: " + temperature + "°C");
    }

    @Override
    public void showWeather() {
        super.showWeather();
        System.out.println("Sunny with temperature: " + temperature + "°C");
    }

    public static void main(String[] args) {
        Weather[] forecasts = {
            new Thunderstorm("Rainy", 100, true),
            new Storm("Windy", 60),
            new Sunshine("Clear Sky", 32)
        };

        System.out.println("------ Weather Forecasts ------");
        for (Weather w : forecasts) {
            w.showWeather();
            System.out.println("----------------");
        }
    }
}
