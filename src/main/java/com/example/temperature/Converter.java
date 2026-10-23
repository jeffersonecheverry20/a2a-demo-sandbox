public class Converter {

    public static double celsiusToFahrenheit(double celsius) {
        return Math.round(((celsius * 9.0 / 5.0) + 32) * 100.0) / 100.0;
    }
}