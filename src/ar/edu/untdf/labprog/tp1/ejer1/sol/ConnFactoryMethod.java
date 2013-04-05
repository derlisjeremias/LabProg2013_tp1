/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Jere
 */
public interface ConnFactoryMethod {
    // Retorna por default una conección Mysql
    public Conn createConn(String type);
}
