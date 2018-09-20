public class CtoFTester {
  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = 9 * ( celsius / 5) + 32;
    return fahrenheit;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = ((fahrenheit - 32) *5) / 9 ;
    return celsius;
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(50.0));
    System.out.println(fahrenheitToCelsius(100.0));
  }
}
