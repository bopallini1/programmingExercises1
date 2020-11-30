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
public class passwordValidator {
    String password;
    int passwordInt;
    String passwordStrength;
    String passwordChar;
    String nonSpecialChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    public passwordValidator(String passwordIn){
        password = passwordIn;
    }
    String Strength(){
        try{
        passwordInt = Integer.parseInt(password);
            if (password.length() < 8) {
                passwordStrength = "very weak";
            }
            else{
                passwordStrength = "weak";
            }
        }
        catch (NumberFormatException e){
            if (password.contains("1")==false && password.contains("2")==false && password.contains("3")==false && password.contains("4")==false && password.contains("5")==false && password.contains("6")==false && password.contains("7")==false && password.contains("8")==false && password.contains("9")==false && password.contains("0")==false) {
                passwordStrength = "weak";
            }
            else{
                if (password.length() < 8) {
                    passwordStrength = "weak";
                }
                else{
                    for (int i = 0; i < password.length(); i++) {
                        passwordChar = password.substring(i,i+1);
                        if (nonSpecialChar.contains(passwordChar)==false) {
                            passwordStrength = "very strong";
                            i = password.length();
                        }
                        else{
                            passwordStrength = "strong";
                        }
                        
                        
                    }
                }
            }
        }
        return passwordStrength;
        }
    
    
    
}
