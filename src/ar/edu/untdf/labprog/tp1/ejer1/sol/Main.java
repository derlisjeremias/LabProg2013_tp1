/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author matiasgel
 */
public class Main {

    public static void main(String args[]) {
        ConnFactory factory = new ConnFactory();
        Conn conn = factory.createConn("postgres");
        conn.connect();
        conn.query();
    }
}
