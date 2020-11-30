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
public class validateZipCode {
    String zipCode;
    int zipCodeInt;
    String zipCodeValidation;
    public validateZipCode(String zipCodeIn){
        zipCode = zipCodeIn;
    }
    String validateZip(){
        try{
            zipCodeInt = Integer.parseInt(zipCode);
            if (zipCode.length()<5) {
                zipCodeValidation = "The zip code must be 5 digits.";
            }
            else{
                if (zipCode.length()>5) {
                    zipCodeValidation = "The zip code must be 5 digits.";
                }
                else{
                    zipCodeValidation = "No errors found.";
                }
            }
        }
        catch (NumberFormatException l){
            zipCodeValidation = "The zip code must be numeric.";
        }
        return zipCodeValidation;
    }
}
