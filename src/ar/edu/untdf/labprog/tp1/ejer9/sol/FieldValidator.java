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
public class FieldValidator {

    protected Validador validador = null;

    public FieldValidator(Validador v) {
        this.validador = v;
    }

    public boolean validateEmail(String email) {
        String regex = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateDni(String dni) {
        String regex = "(\\d{8})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        return matcher.matches();

    }

    public void validate() {
        String email = validador.getEmail();
        String dni = validador.getDocument();

        if (validateEmail(email)) {
            System.out.println("El mail " + email + " es correcto.");
        } else {
            System.out.println("El mail " + email + " es incorrecto.");
        }

        if (validateDni(dni)) {
            System.out.println("El documento " + dni + " es correcto.");
        } else {
            System.out.println("El documento " + dni + " es incorrecto.");
        }
    }
}
