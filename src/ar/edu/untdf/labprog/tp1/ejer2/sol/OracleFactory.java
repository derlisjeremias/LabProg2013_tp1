/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;


/**
 *
 * @author Jere
 */
public class OracleFactory extends ConnFactoryMethod {

    public Conn createConnection() {
        Conn conn = new OracleConn();
        return conn;
    }
}
