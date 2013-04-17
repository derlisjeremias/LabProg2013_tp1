/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;



/**
 *
 * @author matiasgel
 */
public class MsSqlServerConnAdapter implements Conn {
    
    private MsSqlServer adapted = new MsSqlServer();

    public void connect() {
        this.adapted.getConnect();
    }

    public void query(String q) {
        this.adapted.executeQuery(q);
    }
}
