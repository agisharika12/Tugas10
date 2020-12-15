import java.util.Scanner;
public class Suhu {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan derajat dalam Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println("Temperature dalam Celsius:"+celsius);
    }
}