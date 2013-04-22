/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Jere
 */
public class EmailFieldValidator implements FieldValidator {

    public Validador validador;
    ValidatorStrategy strategy = new EmailValidatorStrategy();

    public EmailFieldValidator(Validador v) {
        this.validador = v;
    }

    @Override
    public void validate() {
        String email = validador.getEmail();

        if (strategy.isValid(email)) {
            System.out.println("El mail " + email + " es correcto.");
        } else {
            System.out.println("El mail " + email + " es incorrecto.");
        }
    }
}
