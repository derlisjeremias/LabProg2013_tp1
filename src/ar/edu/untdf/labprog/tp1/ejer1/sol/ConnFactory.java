/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Jere
 */
public class ConnFactory implements ConnFactoryMethod {

// Retorna por default una conección Mysql
    public Conn createConn(String type) {
        ConnFactoryMethod factory = null;
        Conn conn = null;
        if (type.equals("oracle")) {
            factory = new OracleFactory();
            conn = factory.createConn(type);
            return conn;
        }
        if (type.equals("mysql")) {
            factory = new MysqlFactory();
            conn = factory.createConn(type);
            return conn;
        }
        if (type.equals("postgres")) {
            factory = new PostgresFactory();
            conn = factory.createConn(type);
            return conn;
        } else {
            return new MysqlConn();
        }
    }
}
