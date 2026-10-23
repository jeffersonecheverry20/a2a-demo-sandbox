public class Converter {
    /**
     * Converts a temperature from Celsius to Fahrenheit and returns the result rounded to two decimal places.
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit, rounded to two decimal places
     */
    public static double celsiusToFahrenheit(double celsius) {
        final double MAX_ALLOWED_TEMPERATURE = 1000; // Handle extremely high values
        final double MIN_ALLOWED_TEMPERATURE = -1000; // Handle extremely low values
        if (celsius > MAX_ALLOWED_TEMPERATURE || celsius < MIN_ALLOWED_TEMPERATURE) {
            throw new IllegalArgumentException("Temperature out of range: " + celsius);
        }
        return Math.round(((celsius * 9.0 / 5.0) + 32) * 100.0) / 100.0;
    }
}

public class ConverterTest {
    @org.junit.jupiter.api.Test
    void testCelsiusToFahrenheit() {
        // Valid cases
        assertEquals(32.0, celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, celsiusToFahrenheit(100), 0.001);
        // Edge cases
        assertThrows(IllegalArgumentException.class, () -> celsiusToFahrenheit(1001));
        assertThrows(IllegalArgumentException.class, () -> celsiusToFahrenheit(-1001));
    }
}