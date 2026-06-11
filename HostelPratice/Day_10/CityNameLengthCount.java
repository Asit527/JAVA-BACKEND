// Write a program that:
//     - reads a city name using Scanner
//     - prints the length of the city name

    import java.util.Scanner;
    class CityNameLengthCount{
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your city name : ");
        String cityName= sc.next();
        sc.close();
        System.out.println("lenght of the city name : "+cityName.length());
    }
    }