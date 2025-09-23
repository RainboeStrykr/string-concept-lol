public class Storm extends Weather {
    protected int windSpeed;

    public Storm(String condition, int windSpeed) {
        super(condition);
        this.windSpeed = windSpeed;
        System.out.println("Storm created with wind speed " + windSpeed + " km/h");
    }

    @Override
    public void showWeather() {
        super.showWeather();
        System.out.println("Storm with wind speed: " + windSpeed + " km/h");
    }
}