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
        ConnFactoryMethod factory = new MysqlFactory();
        //ConnFactoryMethod factory = new OracleFactory();
        //ConnFactoryMethod factory = new PostgresFactory();
        Conn conn = factory.createConn();
        conn.connect();
        conn.query();
    }
}
