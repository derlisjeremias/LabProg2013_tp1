/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Jere
 */
public class MysqlFactory extends ConnFactoryMethod {

    public Conn createConn() {
        Conn conn = new MysqlConn();
        return conn;
    }
}
