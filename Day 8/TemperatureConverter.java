import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Calculate Fahrenheit equivalent for 24 degrees Celsius
        float fahrenheit = convertCelsiusToFahrenheit(24);
        System.out.println("Fahrenheit equivalent: " + fahrenheit);
    }

    // Method to convert temperature in Celsius to Fahrenheit
    static float convertCelsiusToFahrenheit(int celsius) {
        float fahrenheit = celsius * 9f / 5f + 32f; // Formula to convert Celsius to Fahrenheit
        return fahrenheit;
    }
}
