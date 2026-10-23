public class Converter {
    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit, rounded to two decimal places
     */
    public static double celsiusToFahrenheit(double celsius) {
        final double MAX_CELSIUS = 1000; // Handle extremely high values
        final double MIN_CELSIUS = -1000; // Handle extremely low values
        if (celsius > MAX_CELSIUS || celsius < MIN_CELSIUS) {
            throw new IllegalArgumentException("Temperature out of range: " + celsius);
        }
        return Math.round(((celsius * 9.0 / 5.0) + 32) * 100.0) / 100.0;
    }
}