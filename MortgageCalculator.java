import java.text.NumberFormat;
import java.util.*;
public class MortgageCalculator {
public static void main(String[] args){
final byte monthsInYear = 12;
final byte percent = 100;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Principal amount: ");
int principal = scanner.nextInt();
System.out.print("Enter interest rate: ");
float rate = scanner.nextFloat();
float monthlyrate = (rate/(float)percent)/(float)monthsInYear; //user enters 5, u convert to 0.05 and div by 12 for monthly rate
System.out.print("Enter the period (yrs): ");
byte period = scanner.nextByte();
int monthlyperiod = period * monthsInYear; //user enters just the year value, u convert to months
float mortgage = (float) (principal*(monthlyrate*Math.pow(1+monthlyrate, (float)monthlyperiod)/(Math.pow(1+monthlyrate, monthlyperiod)-1)));
NumberFormat currency = NumberFormat.getCurrencyInstance();
String monthly = currency.format(mortgage);
System.out.println("Mortgage is: " + monthly);
scanner.close();
}
}


