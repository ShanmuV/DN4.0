import java.util.*;

public class Forecast {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.err.println("Enter the Amount: ");
        double amount = s.nextDouble();
        System.out.println("Enter the Rate of growth: ");
        double rate = s.nextDouble();
        System.out.println("Enter the no. of years: ");
        int years = s.nextInt();
        s.close();
        double forecast = calcForecast(amount, years, rate);
        System.out.println("The Forecasted amount will be: "+String.valueOf(forecast));
    }

    // Recursive function
    public static double calcForecast(double val, int years, double rate){
        if (years==0) return val;
        return calcForecast(val, years-1, rate) * (1 + rate); // adds (100 + rate) % every year to value
    }
}
