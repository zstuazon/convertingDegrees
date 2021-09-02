// Author: Tuazon, Z.
// The program interacts with user to convert the temperature.



import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class project1 {
  public static void main(String[] args) {
    userInput();
  }

  // Fahreinheit to Celsius
  public static float convert_f2c(float num) {
    float celsius  = 0;
    celsius = (num - 32) * 5/9;

    return celsius ;
  }

  // Fahreinheit to Kelvin
  public static float convert_f2k(float num) {
    float kelvin = 0;
    kelvin = (num - 32) * 5/9 + (float)273.15;

    return kelvin;
  }

  // Convert Celsius to Fahreinheit
  public static float convert_c2f(float num) {
    float fahr = 0;
    fahr = (num * (9/5)) + 32;
    return fahr;
  }

  // Convert Celsius to Kelvin
  public static float convert_c2k(float num) {
    float kelvin = 0;
    kelvin = (num * (9/5)) + 32 + (float)273.15;
    return kelvin;
  }

  // Convert Kelvin to Fahreinheit
  public static float convert_k2f(float num) {
    float fahr = 0;
    fahr = (num - (float)273.15) * (9/5) + 32;
    return fahr;
  }

  // Convert Kelvin to Celsius
  public static float convert_k2c(float num) {
    float celcius = 0;
    celcius = (num - (float)273.15);
    return celcius;
  }

  public static void userInput() {
    df.setRoundingMode(RoundingMode.DOWN);
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Enter 1, 2 or 3");
    System.out.println("1 for Fahreinheit, 2 for Celsius, 3 for Kelvin");
    int num = sc.nextInt();

    // Choice is Fahreinheit
    if (num == 1) {
      System.out.println("Enter Fahreinheit temp:");
      String str = sc2.nextLine();
      System.out.println(">>>>>> Enter 1 to convert to Celsius <<<<<<");
      System.out.println(">>>>>> Enter 2 to convert to Kelvin <<<<<<");
      int num2 = sc.nextInt();
      if(num2 == 1) {

        System.out.print("Fahreinheit to Celsius = "
                    + df.format(convert_f2c(Float.parseFloat(str))));
        System.out.println(" C");
        System.out.println("");
      }
      else if(num2 == 2) {
        System.out.print("Fahreinheit to Kelvin = "
                      + df.format(convert_f2k(Float.parseFloat(str))));
        System.out.println(" K");
        System.out.println("");
      }
      else {
        System.out.println("INVALID ENTRY");

      }

      System.out.println("Do you want to continue?");
      System.out.println(">>>>>> Enter 1 for yes <<<<<<");
      System.out.println(">>>>>> Enter 2 for no <<<<<<");
      int num3 = sc3.nextInt();
      if(num3 == 1) {
        userInput();
      }
      else if(num3 == 2) {
        System.out.println("Bye bye :)");
        System.out.println("");
      }
      else {
          System.out.println("INVALID ENTRY");
          System.out.println("");
      }

    }
    // Choice is Celcius
    else if (num == 2) {
      System.out.println("Enter Celsius temp:");
      String str = sc2.nextLine();
      System.out.println(">>>>>> Enter 1 to convert to Fahreinheit <<<<<<");
      System.out.println(">>>>>> Enter 2 to convert to Kelvin <<<<<<");
      int num2 = sc.nextInt();
      if(num2 == 1) {

        System.out.print("Celsius to Fahreinheit = "
                    + df.format(convert_c2f(Float.parseFloat(str))));
        System.out.println(" F");
        System.out.println("");
      }
      else if(num2 == 2) {
        System.out.print("Celsius to Kelvin = "
                      + df.format(convert_c2k(Float.parseFloat(str))));
        System.out.println(" K");
        System.out.println("");
      }
      else {
        System.out.println("INVALID ENTRY");
        System.out.println("");

      }

      System.out.println("Do you want to continue?");
      System.out.println(">>>>>> Enter 1 for yes <<<<<<");
      System.out.println(">>>>>> Enter 2 for no <<<<<<");
      int num3 = sc3.nextInt();
      if(num3 == 1) {
        userInput();
      }
      else if(num3 == 2) {
        System.out.println("Bye bye :)");
        System.out.println("");
      }
      else {
          System.out.println("INVALID ENTRY");
          System.out.println("");
      }
    }

    // Choice is Kelvin
    else if (num == 3) {
      System.out.println("Enter Kelvin temp:");
      String str = sc2.nextLine();
      System.out.println(">>>>>> Enter 1 to convert to Fahreinheit <<<<<<");
      System.out.println(">>>>>> Enter 2 to convert to Celsius <<<<<<");
      int num2 = sc.nextInt();
      if(num2 == 1) {

        System.out.print("Kelvin to Fahreinheit = "
                    + df.format(convert_k2f(Float.parseFloat(str))));
        System.out.println(" F");
        System.out.println("");
      }
      else if(num2 == 2) {
        System.out.print("Kelvin to Celsius = "
                      + df.format(convert_k2c(Float.parseFloat(str))));
        System.out.println(" C");
      }
      else {
        System.out.println("INVALID ENTRY");
        System.out.println("");

      }

      System.out.println("Do you want to continue?");
      System.out.println(">>>>>> Enter 1 for yes <<<<<<");
      System.out.println(">>>>>> Enter 2 for no <<<<<<");
      int num3 = sc3.nextInt();
      if(num3 == 1) {
        userInput();
      }
      else if(num3 == 2) {
        System.out.println("Bye bye :)");
        System.out.println("");
      }
      else {
          System.out.println("INVALID ENTRY");
          System.out.println("");
      }
    }

    sc.close();
    sc2.close();
    sc3.close();
  }

  // The function allows user to round a float number to two decimal places.
  private static DecimalFormat df = new DecimalFormat("0.00");
}
