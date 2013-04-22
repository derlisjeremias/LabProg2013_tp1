/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer10.sol;

/**
 *
 * @author Jere
 */
public class ProvinciaValidatorStrategy implements ValidatorStrategy {

    String[] p_validas = {"buenos aires", "catamarca", "chaco",
        "chubut", "cordoba", "corrientes", "entre rios", "formosa",
        "jujuy", "la pampa", "la rioja", "mendoza", "misiones", "neuquen",
        "rio negro", "salta", "san juan", "san luis", "santa cruz", "santa fe",
        "santiago del estero", "tierra del fuego", "tucuman"};

    public String removeAccent(String provincia) {
        String p = provincia;
        p = p.replace('á', 'a');
        p = p.replace('é', 'e');
        p = p.replace('í', 'i');
        p = p.replace('ó', 'o');
        p = p.replace('ú', 'u');
        return p;
    }

    @Override
    public boolean isValid(String provincia) {
        
        String p = provincia.toLowerCase();
        p = removeAccent(p);
        
        boolean flag = false;
        int i = 0;
        
        while (!flag && i < p_validas.length) {
            if (p.equals(p_validas[i])) {
                flag = true;
            }
            i++;
        }
        return flag;
    }
}
