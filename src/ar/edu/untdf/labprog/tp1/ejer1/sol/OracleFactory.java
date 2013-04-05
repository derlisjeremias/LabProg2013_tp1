/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Jere
 */
public class OracleFactory implements ConnFactoryMethod {

    public Conn createConn(String type) {
        Conn conn = new OracleConn();
        return conn;
    }
}
