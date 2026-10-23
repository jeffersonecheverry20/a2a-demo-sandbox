public class Converter {

    /**
     * Converts Celsius to Fahrenheit.
     * Formula: (Celsius * 9/5) + 32
     * Example test: celsiusToFahrenheit(0) should return 32.0
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Example test to verify the celsiusToFahrenheit function.
     */
    // public static void main(String[] args) {
    //     double result = celsiusToFahrenheit(0);
    //     if (result == 32.0) {
    //         System.out.println("Test passed");
    //     } else {
    //         System.out.println("Test failed");
    //     }
    // }