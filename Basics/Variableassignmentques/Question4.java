package Variableassignmentques;
//Convert Celsius to Fahrenheit
public class Question4 {
    public static void main(String[] args){
        System.out.println("Enter the temperature in Celsius: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float celsius = scanner.nextFloat();
        float fahrenheit = CelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
    public static float CelsiusToFahrenheit(float celsius) {
        return (celsius * 9/5.0f) + 32;
    }
}
