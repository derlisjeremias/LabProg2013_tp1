/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Jere
 */
public abstract class Store {

    protected static Conn connection = null;

    abstract Conn getConnection();

    public void buy(String code, int quantity) {
        Conn c = getConnection();
        c.connect();
        c.query("UPDATE merchandise SET stock = stock + " + quantity + " WHERE id_code = " + code);
    }

    public void sell(String code, int quantity) {
        Conn c = getConnection();
        c.connect();
        c.query("UPDATE merchandise SET stock = stock - " + quantity + " WHERE id_code = " + code);
    }
}
