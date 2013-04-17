/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Jere
 */
public class StoreWithMsSqlServer extends Store{

    @Override
    public Conn getConnection() {
        if (Store.connection == null) {
            Store.connection = new MsSqlServerConnAdapter();
        }
        return Store.connection;
    }
}
