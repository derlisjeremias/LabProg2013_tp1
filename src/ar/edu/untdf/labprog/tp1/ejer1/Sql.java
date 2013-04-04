/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1;

/**
 *
 * @author matiasgel
 */
public class Sql {

    public void query(String type) {
        Conn conn = null;
        if (type.equals("oracle")) {
            conn = new OracleConn();
        } else if (type.equals("mysql")) {
            conn = new MysqlConn();
        } else if (type.equals("postgres")) {
            conn = new PostgresConn();
        } else {
            System.out.println("db no definida");
            return;
        }
        conn.query();
    }
}
