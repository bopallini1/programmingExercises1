/*
 * Ross Stewart
 * AT Computer Science 2020-2021
 * Bop
 */
package programmingexercises1;

/**
 *
 * @author rossaroni
 */
public class payOffCreditCard {
    double balance;
    double APR;
    double monthlyPay;
    double monthsToPay;
    double placeholdNum;
    public payOffCreditCard(double balanceIn,double aprIn,double monthlyPayIn){
        balance = balanceIn;
        APR = aprIn;
        monthlyPay = monthlyPayIn;
    }
    double monthsToPayOff(){
        APR /= 36500;
        APR += 1;
        placeholdNum = 1-Math.pow(APR, 30);
        balance = 1+(balance/monthlyPay);
        placeholdNum *= -balance;
        placeholdNum = Math.log10(placeholdNum);
        placeholdNum /= -30*Math.log10(APR);
        monthsToPay = placeholdNum;
        return monthsToPay;
    }
}
