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
public class isAnagram {
    String word1;
    String word2;
    boolean anagramCheck;
    ArrayList<String> letters1 = new ArrayList<String>();
    ArrayList<String> letters2 = new ArrayList<String>();
    public isAnagram(String word1In,String word2In) {
        word1 = word1In;
        word2 = word2In;   
    }
//Idk what this method is
    isAnagram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    boolean anagramChecker(){
        anagramCheck = true;
        if (word1.length() != word2.length()) {
            anagramCheck = false;
        }
        else{
            for (int i = 0; i < word1.length(); i++) {
                letters1.add(word1.substring(i,i+1));
                letters2.add(word2.substring(i,i+1));
            }
            for (String string : letters1) {
                if (letters2.contains(string)==false) {
                    anagramCheck = false;
                }
            }
            for (String string : letters2) {
                if (letters1.contains(string)==false) {
                    anagramCheck = false;
                }
            }
            
        }
        return anagramCheck;
    }
    
}
