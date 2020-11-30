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
public class validateEmployeeId {
    String employeeId;
    String employeeIdLetters;
    String employeeIdHyphen;
    String employeeIdNumbers;
    int employeeIdNumNum;
    String employeeIdExtra;
    String employeeIdValidation;
    String capitalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public validateEmployeeId(String employeeIdIn){
        employeeId = employeeIdIn;
    }
    String validateId(){
        try{
            employeeIdLetters = employeeId.substring(0,2);
            employeeIdHyphen = employeeId.substring(2,3);
            employeeIdNumbers = employeeId.substring(3,7);
            if (capitalAlphabet.contains(employeeIdLetters.substring(0,1))==false || capitalAlphabet.contains(employeeIdLetters.substring(1))==false) {
                employeeIdValidation = "The employee ID is formatted incorrectly.";
            }
            else{
                if (employeeIdHyphen.equals("-")==false) {
                    employeeIdValidation = "The employee ID is formatted incorrectly.";
                }
                else{
                    try{
                        employeeIdNumNum = Integer.parseInt(employeeIdNumbers);
                        employeeIdValidation = "No errors found.";
                    }
                    catch (NumberFormatException g){
                        employeeIdValidation = "The employee ID is formatted incorrectly.";
                    }
                }
            }
        }
        catch (Exception h){
            employeeIdValidation = "The employee ID is too short.";
        }
        if (employeeId.length()>7) {
            employeeIdValidation = "The employee ID is too long.";
        }
        return employeeIdValidation;
        
    }
}
