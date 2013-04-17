/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Jere
 */
public class FieldValidator {

    protected Validador validador = null;

    public FieldValidator(Validador v) {
        this.validador = v;
    }

    public void validate() {
        String email = validador.getEmail();
        String dni = validador.getDocument();
        ValidatorStrategy v;

        v = new EmailValidatorStrategy();
        if (v.isValid(email)) {
            System.out.println("El mail " + email + " es correcto.");
        } else {
            System.out.println("El mail " + email + " es incorrecto.");
        }

        v = new DniValidatorStrategy();
        if (v.isValid(dni)) {
            System.out.println("El documento " + dni + " es correcto.");
        } else {
            System.out.println("El documento " + dni + " es incorrecto.");
        }
    }
}
