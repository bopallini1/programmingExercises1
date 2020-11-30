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
public class validateNames {
    String firstName;
    String lastName;
    String firstNameValidation;
    String lastNameValidation;
    public validateNames(String firstNameIn,String lastNameIn){
        firstName = firstNameIn;
        lastName = lastNameIn;
    }
    String validateFirst(){
        try{
            Integer.parseInt(firstName);
            firstNameValidation = "A first name must contain letters.";
        }
        catch (NumberFormatException e){
            if (firstName.length()<2) {
                firstNameValidation = "A first name must be at least 2 letters long.";
            }
            else{
                firstNameValidation = "No errors found.";
            }
        }
        return firstNameValidation;
    }
    String validateLast(){
        try{
            Integer.parseInt(lastName);
            lastNameValidation = "A last name must contain letters.";
        }
        catch (NumberFormatException f){
            if (lastName.length()<2) {
                lastNameValidation = "A last name must be at least 2 letters long.";
            }
            else{
                lastNameValidation = "No errors found.";
            }
        }
        return lastNameValidation;
    }
}
