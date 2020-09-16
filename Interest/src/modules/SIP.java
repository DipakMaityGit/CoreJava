package modules;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SIP {

    public double getTargetDetails(double initialAmount, double goalAmount,double monthlyInstallment,
                                 double yearlyIncrementPercent, double interestRate){
        SimpleDateFormat format1 = new SimpleDateFormat("MMM, yyyy");
        DecimalFormat df2 = new DecimalFormat("0.00");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,1);

        double currentAmount = initialAmount,tempcurrentAmt = initialAmount;
        double interestGain = 0d,totalInterestGained = 0d;
        int counter = 0;
        while (currentAmount < goalAmount){
            interestGain = (currentAmount * interestRate)/1200;
            tempcurrentAmt = currentAmount;
            currentAmount += interestGain;
            totalInterestGained += interestGain;
            if(counter == 0) {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" +
                        String.format("%.2f", interestGain) + " ). Total = ₹" + String.format("%.2f", currentAmount));
            }else {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" + String.format("%.2f", interestGain)
                        + "). Total = ₹" + String.format("%.2f", currentAmount));
            }
            currentAmount += monthlyInstallment;
            System.out.println(format1.format(calendar.getTime())+" Installment : ₹"+String.format("%.2f", monthlyInstallment)
                    +". Total = ₹"+String.format("%.2f", currentAmount)+"\n");
            calendar.add(Calendar.MONTH,1);
            counter++;
            if(calendar.get(Calendar.MONTH) == 0 && yearlyIncrementPercent > 0d){
                double increment = monthlyInstallment * yearlyIncrementPercent/100;
                monthlyInstallment += increment;
            }
        }
        System.out.println("Final Amount : ₹"+String.format("%.2f", currentAmount) +" , Total Interest Gained : "
                +String.format("%.2f",totalInterestGained));
        System.out.println("Total months required : "+counter);
        return currentAmount;
    }
    public double getGrossAfterTime(double initialAmount,double timeInMonths,double monthlyInstallment,
                                  double yearlyIncrementPercent, double interestRate){
        SimpleDateFormat format1 = new SimpleDateFormat("MMM, yyyy");
        DecimalFormat df2 = new DecimalFormat("#.##");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,1);

        double currentAmount = initialAmount,tempcurrentAmt = initialAmount;
        double interestGain = 0d,totalInterestGained = 0d;
        int counter = 0;

        for (int i = 0 ;i< (int)timeInMonths;i++){
            interestGain = (currentAmount * interestRate)/1200;
            tempcurrentAmt = currentAmount;
            currentAmount += interestGain;
            totalInterestGained += interestGain;
            if(counter == 0) {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" +
                        String.format("%.2f", interestGain) + " ). Total = ₹" + String.format("%.2f", currentAmount));
            }else {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" + String.format("%.2f", interestGain)
                        + "). Total = ₹" + String.format("%.2f", currentAmount));
            }
            currentAmount += monthlyInstallment;
            System.out.println(format1.format(calendar.getTime())+" Installment : ₹"+String.format("%.2f", monthlyInstallment)
                    +". Total = ₹"+String.format("%.2f", currentAmount)+"\n");
            calendar.add(Calendar.MONTH,1);
            counter++;
            if(calendar.get(Calendar.MONTH) == 0 && yearlyIncrementPercent > 0d){
                double increment = monthlyInstallment * yearlyIncrementPercent/100;
                monthlyInstallment += increment;
            }
        }
        System.out.println("Final Amount : ₹"+String.format("%.2f", currentAmount) +" , Total Interest Gained : "
                +String.format("%.2f",totalInterestGained));
        return currentAmount;
    }

    public double getGrossAfterStopSIP(double initialAmount,double timeInMonths,double monthlyInstallment,
                                    double yearlyIncrementPercent, double interestRate, double onlyInterestTime){
        SimpleDateFormat format1 = new SimpleDateFormat("MMM, yyyy");
        DecimalFormat df2 = new DecimalFormat("#.##");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,1);

        double currentAmount = initialAmount,tempcurrentAmt = initialAmount;
        double interestGain = 0d,totalInterestGained = 0d;
        int counter = 0;

        for (int i = 0 ;i< (int)timeInMonths;i++){
            interestGain = (currentAmount * interestRate)/1200;
            tempcurrentAmt = currentAmount;
            currentAmount += interestGain;
            totalInterestGained += interestGain;
            if(counter == 0) {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" +
                        String.format("%.2f", interestGain) + " ). Total = ₹" + String.format("%.2f", currentAmount));
            }else {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" + String.format("%.2f", interestGain)
                        + "). Total = ₹" + String.format("%.2f", currentAmount));
            }
            currentAmount += monthlyInstallment;
            System.out.println(format1.format(calendar.getTime())+" Installment : ₹"+String.format("%.2f", monthlyInstallment)
                    +". Total = ₹"+String.format("%.2f", currentAmount)+"\n");
            calendar.add(Calendar.MONTH,1);
            counter++;
            if(calendar.get(Calendar.MONTH) == 0 && yearlyIncrementPercent > 0d){
                double increment = monthlyInstallment * yearlyIncrementPercent/100;
                monthlyInstallment += increment;
            }
        }

        for (int i = 0 ;i< (int)onlyInterestTime;i++){
            interestGain = (currentAmount * interestRate)/1200;
            tempcurrentAmt = currentAmount;
            currentAmount += interestGain;
            totalInterestGained += interestGain;
           /* if(counter == 0) {
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" +
                        String.format("%.2f", interestGain) + " ). Total = ₹" +
                        String.format("%.2f", currentAmount));
            }else {*/
                System.out.println(format1.format(calendar.getTime()) + " => (Balance : ₹" +
                        String.format("%.2f", tempcurrentAmt) + " + Interest Gained : ₹" +
                        String.format("%.2f", interestGain)
                        + "). Total = ₹" + String.format("%.2f", currentAmount));
           // }
           // currentAmount += monthlyInstallment;
            //System.out.println(format1.format(calendar.getTime())+" Installment : ₹"+String.format("%.2f", monthlyInstallment)
             //       +". Total = ₹"+String.format("%.2f", currentAmount)+"\n");
            calendar.add(Calendar.MONTH,1);
            counter++;
        }
        System.out.println("Final Amount : ₹"+String.format("%.2f", currentAmount) +" , Total Interest Gained : "
                +String.format("%.2f",totalInterestGained));
        return currentAmount;
    }
}
