/*
 * Ross Stewart
 * AT Computer Science 2020-2021
 * Bop
 */
package programmingexercises1;

import java.util.ArrayList;

/**
 *
 * @author rossaroni
 */
public class validateInput {
    String validation = "";
    String validateFirstName;
    String validateLastName;
    String validateZipCode;
    String validateId;
    ArrayList<String> validations = new ArrayList<String>();
    
    public validateInput(String validateFirstNameIn,String validateLastNameIn,String validateZipCodeIn,String validateIdIn){
        validateFirstName = validateFirstNameIn;
        validateLastName = validateLastNameIn;
        validateZipCode = validateZipCodeIn;
        validateId = validateIdIn;
        
    }
    
    
    ArrayList<String> pointless(){
        validations.add(validateFirstName);
        validations.add(validateLastName);
        validations.add(validateZipCode);
        validations.add(validateId);
        return validations;
    }
    
}
