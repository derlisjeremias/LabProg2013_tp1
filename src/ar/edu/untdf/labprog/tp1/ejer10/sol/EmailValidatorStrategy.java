/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer10.sol;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Jere
 */
public class EmailValidatorStrategy implements ValidatorStrategy {

    @Override
    public boolean isValid(String email) {
        String regex = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
