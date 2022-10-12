// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths = numYears * 12;
        // Convert to decimal, then months
        double monthlyRate = (annualRate / 100) / 12;

        double num = monthlyRate * Math.pow(1 + monthlyRate, numMonths);
        double denom = Math.pow(1 + monthlyRate, numMonths) - 1;
        double monPay = (num/denom) * principal;

        double totPay = monPay * numMonths;
        double totInt = totPay - principal;

        System.out.println("Principal:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of Years:    " + numYears);
        System.out.println("Monthly Payment:    $" + monPay);
        System.out.println("Total Payments:     $" + totPay);
        System.out.println("Total Payments:     $" + totInt);



        System.out.println();
    }
}

