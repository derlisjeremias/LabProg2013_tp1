/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer9.sol;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Jere
 */
public class DniValidatorStrategy implements ValidatorStrategy {

    @Override
    public boolean isValid(String dni) {
        String regex = "(\\d{8})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        return matcher.matches();
    }
}
