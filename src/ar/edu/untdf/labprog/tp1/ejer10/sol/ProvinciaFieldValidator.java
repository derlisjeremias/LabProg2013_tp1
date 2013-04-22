/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer10.sol;

/**
 *
 * @author Jere
 */
public class ProvinciaFieldValidator implements FieldValidator {

    public Validador validador;
    ValidatorStrategy v = new ProvinciaValidatorStrategy();

    public ProvinciaFieldValidator(Validador v) {
        this.validador = v;
    }

    @Override
    public void validate() {
        String provincia = validador.getProvincia();

        if (v.isValid(provincia)) {
            System.out.println("La cadena " + provincia + " corresponde a una provincia argentina.");
        } else {
            System.out.println("La cadena " + provincia + " no corresponde a una provincia argentina.");
        }
    }
    
}
