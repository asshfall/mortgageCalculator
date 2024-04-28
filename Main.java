package mortgageCalculator;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main{

    public static void main(String[]args){

       Scanner scanner = new Scanner(System.in);

       

       byte months = 12;
       byte percent  = 100;

          System.out.print("Enter Principal: ");
          int principal = scanner.nextInt();

          System.out.print("Enter Annual Interest Rate: ");
          double annualInterestRate = scanner.nextDouble();

          double monthlyInterestRate = annualInterestRate / months / percent;

          System.out.print("Enter Period (Years): ");
          byte numberOfPayments = scanner.nextByte();
             
            int totalNumberOfPayments = numberOfPayments * months;

              double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,totalNumberOfPayments)) / (Math.pow(1+ monthlyInterestRate,totalNumberOfPayments) -1);

                String formattedMortgage = NumberFormat.getInstance().format(mortgage);


          System.out.println("Mortgage Payment: $" + formattedMortgage );



          scanner.close();
    }
}