/*
 * Ross Stewart
 * AT Computer Science 2020-2021
 * Bop
 */
package programmingexercises1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rossaroni
 */
public class ProgrammingExercises1 {
    static final double SQFT_TO_SQM = 0.09290304;
    static final double TAX = 0.055;
    static final double EURO_TO_DOLLAR = 1.19;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyIn = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("0.00");
        
        
        /*
        //Ch2
        //#1
        System.out.print("What is your name? ");
        System.out.println("Hello, "+keyIn.nextLine()+", nice to meet you!");
        
        //#2
        String inputString;
        do{
        System.out.print("What is the input string? ");
        inputString = keyIn.nextLine();
        if (inputString.isEmpty() == true){
            System.out.println("Please enter an input string.");
        }
        } while (inputString.isEmpty() == true);
        System.out.println(inputString+" has "+inputString.length()+" characters.");
            
        //#3
        System.out.print("Enter quote: ");
        String quote = keyIn.nextLine();
        System.out.print("Enter author: ");
        String author = keyIn.nextLine();
        System.out.println(author+" says, \""+quote+"\"");
        
        //#4
        System.out.print("Enter a noun: ");
        String noun = keyIn.nextLine();
        System.out.print("Enter a verb: ");
        String verb = keyIn.nextLine();
        System.out.print("Enter a adjective: ");
        String adj = keyIn.nextLine();
        System.out.print("Enter a adverb: ");
        String adv = keyIn.nextLine();
        System.out.printf("The %s %s %ss %s.\n",adj,noun,verb,adv);
        
        //#5
        String numString1;
        int num1;
        do{
        System.out.print("Please enter the first number: ");
        numString1 = keyIn.nextLine();
        num1 = Integer.parseInt(numString1);
            if (num1 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (num1 < 0);
        String numString2;
        int num2;
        do{
        System.out.print("Please enter the second number: ");
        numString2 = keyIn.nextLine();
        num2 = Integer.parseInt(numString2);
            if (num2 < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (num2 < 0);
        System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
        System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
        System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
        System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
        
        //#6
        System.out.print("Please enter your current age: ");
        int age = keyIn.nextInt();
        System.out.print("Please enter the age you would like to retire: ");
        int ageRetire = keyIn.nextInt();
        if (ageRetire - age <= 0) {
            System.out.println("You can already retire.");
        }
        else{
            System.out.printf("You have %d years left until you can retire.\n",ageRetire-age);
            System.out.printf("It\'s 2020, so you can retire in %d.\n",2020+ageRetire-age);
        }
        
        
        //Ch3
        //#7
        System.out.print("Please enter the length of the room in feet: ");
        double lengthFeet = keyIn.nextDouble();
        System.out.print("Please enter the width of the room in feet: ");
        double widthFeet = keyIn.nextDouble();
        double areaSquareFeet = lengthFeet*widthFeet;
        double areaSquareMeter = areaSquareFeet*SQFT_TO_SQM;
        System.out.printf("The area of the room is %.2f square feet or %.2f square meters.\n",areaSquareFeet,areaSquareMeter);
        
        //#8
        System.out.print("How many people are going to the pizza party? ");
        int pizzaEaters = keyIn.nextInt();
        System.out.print("How many pizzas are there? ");
        int pizzas = keyIn.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = keyIn.nextInt();
        if (slices*pizzas/pizzaEaters == 1) {
            System.out.printf("Each person gets %d slice of pizza with %d slices leftover.\n",slices*pizzas/pizzaEaters,slices*pizzas%pizzaEaters);
        }
        else{
            System.out.printf("Each person gets %d slices of pizza with %d slices leftover.\n",slices*pizzas/pizzaEaters,slices*pizzas%pizzaEaters);
        }
        
        //#9
        System.out.print("Please enter the length of the ceiling: ");
        double ceilingLength = keyIn.nextDouble();
        System.out.print("Please enter the width of the ceiling: ");
        double ceilingWidth = keyIn.nextDouble();
        double paintGallons = ceilingLength*ceilingWidth/350;
        int paintGallon = (int) paintGallons;
        System.out.println(paintGallons);
        System.out.println(paintGallon);
        if (paintGallon == paintGallons) {
            System.out.printf("You will need %d gallons of paint to cover %.2f square feet.\n",paintGallon,ceilingLength*ceilingWidth);
        }
        else{
            System.out.printf("You will need %d gallons of paint to cover %.2f square feet.\n",paintGallon+1,ceilingLength*ceilingWidth);
        }
        
        //#10
        ArrayList<Double> shopping = new ArrayList<Double>();
        boolean shoppingLoop = true;
        double itemPrice;
        double itemQty;
        double itemTotalPrice;
        int shoppingCounter = 1;
        while (shoppingLoop == true){
            System.out.printf("Enter the price of item %d. To stop, enter 0: ",shoppingCounter);
            itemPrice = keyIn.nextDouble();
            if (itemPrice > 0) {
                System.out.printf("Enter the quantity of item %d: ",shoppingCounter);
                itemQty = keyIn.nextDouble();
                itemTotalPrice = itemPrice*itemQty;
                shopping.add(itemTotalPrice);
            }
            else{
                shoppingLoop = false;
            }
            shoppingCounter++;
        }
        double subTotal = 0;
        for (int i = 0; i < shopping.size(); i++) {
            subTotal += shopping.get(i);
        }
        System.out.printf("Subtotal: $%.2f\n",subTotal);
        System.out.printf("Tax: $%.2f\n",TAX*subTotal);
        System.out.printf("Total: $%.2f\n",TAX*subTotal+subTotal);
        
        //11
        System.out.print("Please enter the amount of euros you are exchanging: ");
        double amountEuro = keyIn.nextDouble();
        System.out.println(moneyFormat.format(amountEuro)+" € exchanges to $"+moneyFormat.format(amountEuro*EURO_TO_DOLLAR));

        //12
        System.out.print("Please enter the principal amount: ");
        double principal = keyIn.nextDouble();
        System.out.print("Please enter the annual rate of interest as a percent: ");
        String interestRateString = keyIn.next();
        if (interestRateString.contains("%")==true) {
            interestRateString = interestRateString.replace("%", "");
        }
        double interestRate = Double.parseDouble(interestRateString);
        interestRate /= 100;
        System.out.print("Please enter the number of years: ");
        int interestYears = keyIn.nextInt();
        double principalWorth = interestRate*interestYears + 1;
        principalWorth *= principal;
        System.out.printf("After %d years, your $%.2f will be worth $%.2f\n",interestYears,principal,principalWorth);
        
        //13
        System.out.print("Please enter the principal amount: ");
        double compoundPrincipal = keyIn.nextDouble();
        System.out.print("Please enter the annual rate of interest as a percent: ");
        String compoundInterestRateString = keyIn.next();
        if (compoundInterestRateString.contains("%")==true) {
            compoundInterestRateString = compoundInterestRateString.replace("%", "");
        }
        double compoundInterestRate = Double.parseDouble(compoundInterestRateString);
        compoundInterestRate /= 100;
        System.out.print("Please enter the number of years: ");
        int compoundInterestYears = keyIn.nextInt();
        System.out.print("Please enter the number of times the interest is compounded per year: ");
        int timesCompounded = keyIn.nextInt();
        double compoundPrincipalWorth = compoundInterestRate/timesCompounded;
        compoundPrincipalWorth += 1;
        compoundPrincipalWorth = Math.pow(compoundPrincipalWorth, timesCompounded*compoundInterestYears);
        compoundPrincipalWorth *= compoundPrincipal;
        System.out.printf("After %d years, your $%.2f will be worth $%.2f\n",compoundInterestYears,compoundPrincipal,compoundPrincipalWorth);
        
        
        
        //Ch4
        //14
        System.out.print("Please enter the order amount: ");
        double stateSubtotal = keyIn.nextDouble();
        System.out.println("Please enter the state (Maine or New Hampshire): ");
        String state = keyIn.next();
        double stateTax = 0;
        if (state.equalsIgnoreCase("Maine")==true || state.equalsIgnoreCase("ME")==true) {
            stateTax = 0.055;
        }
        double stateTotal = stateTax+1;
        stateTotal *= stateSubtotal;
        System.out.println("The subtotal is "+moneyFormat.format(stateSubtotal)+"\nThe tax is "+moneyFormat.format(stateTax)+"\nThe total is "+moneyFormat.format(stateTotal));
        
        //15
        System.out.print("Please enter your username: ");
        String username = keyIn.nextLine();
        System.out.print("Please enter your password: ");
        String password = keyIn.nextLine();
        if (username.equals("BluefaceBaby")==true && password.equals("bopallini")==true) {
            System.out.println("Welcome babe ;\\");
        }
        else{
            System.out.println("Getcho stoopid A$$ outta here");
        }
        
        //16
        System.out.print("Please enter you age: ");
        double drivingAge = keyIn.nextDouble();
        if (drivingAge >= 16 && drivingAge<21) {
            System.out.println("You can legally drive. That doesn't mean you should tho.");
        }
        else{
            if (drivingAge >= 21) {
                System.out.println("You can legally drive.");
            }
            else{
                System.out.println("You too young to drive. Getcho stoopid A$$ back to the playground.");
            }
        }
        
        //17
        System.out.print("Please enter the amount of alcohol you consumed, in ounces: ");
        double alcoholConsumed = keyIn.nextDouble();
        System.out.print("Please enter your body weight, in pounds: ");
        double bodyWeight = keyIn.nextDouble();
        boolean sexLoop;
        String sex;
        do {
            System.out.print("Please enter your sex: ");
            sex = keyIn.next();
            if (sex.equalsIgnoreCase("M")==true || sex.equalsIgnoreCase("Male")==true || sex.equalsIgnoreCase("Man")==true || sex.equalsIgnoreCase("Boy")==true || sex.equalsIgnoreCase("Guy")==true || sex.equalsIgnoreCase("Dude")==true || sex.equalsIgnoreCase("Bro")==true) {
            bodyWeight *= 0.73;
            sexLoop=true;
        }
        else{
            if (sex.equalsIgnoreCase("F")==true || sex.equalsIgnoreCase("Female")==true || sex.equalsIgnoreCase("Woman")==true || sex.equalsIgnoreCase("Girl")==true || sex.equalsIgnoreCase("Sis")==true || sex.equalsIgnoreCase("Chick")==true || sex.equalsIgnoreCase("Gal")==true) {
            bodyWeight *= 0.66;
            sexLoop=true;
            }
            else{
                System.out.println("Please enter your assigned sex at birth.");
                sexLoop=false;
            }
        }
        } while (sexLoop==false);
        System.out.print("Please enter the number of hours since your last drink: ");
        double hoursSinceDrink = keyIn.nextDouble();
        alcoholConsumed *= 5.14;
        alcoholConsumed /= bodyWeight;
        hoursSinceDrink *= 0.015;
        alcoholConsumed -= hoursSinceDrink;
        System.out.printf("Your blood alcohol level is %.2f\n",alcoholConsumed);
        if (alcoholConsumed < 0.08) {
            System.out.println("Drive home safely.");
        }
        else{
            System.out.println("Don't you dare drive.");
        }
        
        //18
        boolean tempLoop;
        System.out.print("Please enter your input temperature without units: ");
            double inputTemp = keyIn.nextDouble();
        do {
            System.out.print("Please enter your input temperature units: ");
            String inputTempUnit = keyIn.next();
            if (inputTempUnit.equalsIgnoreCase("Celsius") || inputTempUnit.equalsIgnoreCase("C")) {
                inputTempUnit = "C";
                System.out.printf("%.1f °C\n",inputTemp);
                System.out.printf("%.1f °F\n",inputTemp*1.8+32);
                System.out.printf("%.1f K\n",inputTemp+273);
                tempLoop = true;
            }
            else{
                if (inputTempUnit.equalsIgnoreCase("Fahrenheit") || inputTempUnit.equalsIgnoreCase("F")) {
                    inputTempUnit = "F";
                    System.out.printf("%.1f °F\n",inputTemp);
                    System.out.printf("%.1f °C\n",inputTemp/1.8-17.8);
                    System.out.printf("%.1f K\n",inputTemp/1.8+255.2);
                    tempLoop = true;
                }
                else{
                    if (inputTempUnit.equalsIgnoreCase("Kelvin") || inputTempUnit.equalsIgnoreCase("K")) {
                        inputTempUnit = "K";
                        System.out.printf("%.1f K\n",inputTemp);
                        System.out.printf("%.1f °F\n",inputTemp*1.8-459.4);
                        System.out.printf("%.1f °C\n",inputTemp-273);
                        tempLoop = true;
                    }
                    else{
                        System.out.println("Please enter a valid temperature unit.");
                        tempLoop = false;
                    }
                }
            }
        } while (tempLoop==false);
        
        //19
        System.out.print("Please enter your height (ex: 5'7): ");
        String stringHeight = keyIn.nextLine();
        System.out.print("Please enter your weight in pounds: ");
        double weight = keyIn.nextDouble();
        String stringHeightFeet = stringHeight.substring(0,1);
        String stringHeightInches = stringHeight.substring(2);
        int heightFeet = Integer.parseInt(stringHeightFeet);
        int heightInches = Integer.parseInt(stringHeightInches);
        int height = heightFeet*12;
        height += heightInches;
        height *= height;
        double bmi = weight/height;
        bmi *= 703;
        System.out.printf("Your bmi is %.1f.\n",bmi);
        
        //20
        double salesTax = 0;
        System.out.print("Please enter the order amount: ");
        double orderAmount = keyIn.nextDouble();
        keyIn.nextLine();
        System.out.print("Please enter your state: ");
        String state = keyIn.nextLine();
        if (state.equalsIgnoreCase("Wisconsin")==true || state.equalsIgnoreCase("WI")==true) {
            System.out.print("Please enter your county: ");
            String county = keyIn.nextLine();
            if (county.equalsIgnoreCase("Eau Claire")==true) {
                salesTax = 0.055;
            }
            else{
                if (county.equalsIgnoreCase("Dunn")==true) {
                salesTax = 0.054;
                }
                else{
                    salesTax = 0.05;
                }
            }
            
        }
        else{
            if (state.equalsIgnoreCase("Illinois")==true || state.equalsIgnoreCase("IL")==true) {
            salesTax = 0.08;
            }
        }
        System.out.println("The tax is $"+moneyFormat.format(orderAmount*salesTax));
        System.out.println("The total is $"+moneyFormat.format(orderAmount*salesTax+orderAmount));
        
        //21
        String month = "";
        int monthNum;
        boolean monthLoop;
        do {
            monthLoop = true;
            System.out.print("Please enter the number of the month: ");
            monthNum = keyIn.nextInt();
            switch (monthNum){
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                case 13:
                    month = "Smarch";
                    break;
                default:
                    System.out.println("Please enter a valid month number");
                    monthLoop = false;
                    break;
            }
        } while (monthLoop==false);
        System.out.printf("The name of the month is %s.\n",month);
        
        //22
        System.out.print("Enter how many numbers you would like to compare: ");
        int counter = keyIn.nextInt();
        double tempNum;
        int numberComparer = 0;
        ArrayList<Double> numbers = new ArrayList<Double>();
        for (int i = 0; i < counter; i++) {
            System.out.printf("Enter number #%d: ",i+1);
            tempNum = keyIn.nextDouble();
            if (numbers.contains(tempNum)==false) {
                numbers.add(tempNum);
            }
            else{
                System.out.printf("You have already entered %f.\n",tempNum);
                i--;
            }
            
        }
        for (int i = 0; i < counter; i++) {
            numberComparer = 0;
            for (int j = 0; j < counter; j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    numberComparer++;
                }
                
            }
            if (numberComparer == counter-1) {
                System.out.printf("The greatest number is %f.\n",numbers.get(i));
                i = counter;
            }
        }
        
        //23
        String response;
        System.out.print("Is the car silent when you turn the key? (Yes or no) ");
        response = keyIn.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.print("Are the battery terminals corroded? ");
            response = keyIn.nextLine();
            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                    System.out.println("Replace cables and try starting again.");
            }
            
        }
        else{
                System.out.print("Does the car make a clicking noise? ");
                response = keyIn.nextLine();
                if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                    System.out.println("Replace the battery.");
                }
                else{
                        System.out.print("Does the car crank up but fail to start? ");
                        response = keyIn.nextLine();
                        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                            System.out.println("Check spark plug connections.");
                        }
                        else{
                            System.out.print("Does the engine start and then die? ");
                            response = keyIn.nextLine();
                            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                                System.out.print("Does your car have fuel injection? ");
                                response = keyIn.nextLine();
                                if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                                    System.out.println("Get it in for service.");
                                }
                                else{
                                    System.out.println("Check to ensure the choke is opening and closing.");
                                }
                                
                            }
                        }
                
                }
        }
        
        //24
        
        System.out.print("Enter word one: ");
        String word1 = keyIn.nextLine();
        System.out.print("Enter word two: ");
        String word2 = keyIn.nextLine();
        isAnagram anagram = new isAnagram(word1,word2);
        boolean gram = anagram.anagramChecker();
        if (gram==true) {
            System.out.printf("%s and %s are anagrams.\n",word1,word2);
        }
        else{
            System.out.printf("%s and %s are not anagrams.\n",word1,word2);
        }
        
        //25
        System.out.print("Enter your password: ");
        String password = keyIn.nextLine();
        passwordValidator passwordCheck = new passwordValidator(password);
        System.out.printf("Your password is %s.\n",passwordCheck.Strength()); 
        
        //26
        System.out.print("Please enter your balance: ");
        double balance = keyIn.nextDouble();
        System.out.print("Please enter the APR on the card (as a percent): ");
        double APR = keyIn.nextDouble();
        System.out.print("Please enter the monthly payment you can make: ");
        double monthlyPay = keyIn.nextDouble();
        payOffCreditCard pay = new payOffCreditCard(balance,APR,monthlyPay);
        System.out.printf("It will take you %.0f months to pay off your credit card.\n",1+pay.monthsToPayOff());
        */
        //27
        System.out.print("Enter the first name: ");
        String firstName = keyIn.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = keyIn.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeId = keyIn.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = keyIn.nextLine();
        
        validateNames nameValidation = new validateNames(firstName,lastName);
        String firstNameValidation = nameValidation.validateFirst();
        String lastNameValidation = nameValidation.validateLast();
        
        validateEmployeeId employeeIdValidation = new validateEmployeeId(employeeId);
        String IdValidation = employeeIdValidation.validateId();
        
        validateZipCode zipCodeValidation = new validateZipCode(zipCode);
        String zipValidation = zipCodeValidation.validateZip();
        
        
        
        validateInput inputValidation = new validateInput(firstNameValidation,lastNameValidation,IdValidation,zipValidation);
        ArrayList<String> validations = inputValidation.pointless();
        
        if (validations.get(0).equals("No errors found.") && validations.get(1).equals("No errors found.") && validations.get(2).equals("No errors found.") && validations.get(3).equals("No errors found.")) {
            System.out.println("No errors found.");
        }
        for (int i = 0; i < 4; i++) {
            if (validations.get(i).equalsIgnoreCase("No errors found.")) {
            }
            else{
                System.out.println(validations.get(i));
            }
        }
        
        
    }
    
}
