public class Thunderstorm extends Storm {
    private boolean hasLightning;

    public Thunderstorm(String condition, int windSpeed, boolean hasLightning) {
        super(condition, windSpeed);
        this.hasLightning = hasLightning;
        System.out.println("Thunderstorm created with lightning: " + hasLightning);
    }

    @Override
    public void showWeather() {
        super.showWeather();
        if (hasLightning) {
            System.out.println("This thunderstorm has lightning!");
        }
    }
}