/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author matiasgel
 */
public class PostgresConn implements Conn {

    public void connect() {
        System.out.println("Conectado a Postgres");
    }

    public void query(String q) {
        System.out.println("Consulta a Postgres");
        System.out.println(q);
    }
}
