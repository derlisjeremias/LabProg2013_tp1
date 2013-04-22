/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Jere
 */
public class DniFieldValidator implements FieldValidator {

    public Validador validador;
    ValidatorStrategy strategy = new DniValidatorStrategy();

    public DniFieldValidator(Validador v) {
        this.validador = v;
    }

    @Override
    public void validate() {
        String dni = validador.getDocument();

        if (strategy.isValid(dni)) {
            System.out.println("El documento " + dni + " es correcto.");
        } else {
            System.out.println("El documento " + dni + " es incorrecto.");
        }
    }
}
