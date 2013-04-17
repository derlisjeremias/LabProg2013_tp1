/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author matiasgel
 */
public class MsSqlServer {

    public void getConnect() {
        System.out.println("Conectado a MsSql");
    }

    public void executeQuery(String q) {
        System.out.println("Consulta a MsSql");
        System.out.println(q);
    }
}
