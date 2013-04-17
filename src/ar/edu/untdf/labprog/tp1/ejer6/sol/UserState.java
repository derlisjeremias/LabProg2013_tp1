/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public abstract class UserState {

    public String name = null;

    abstract boolean isStart();

    abstract boolean isUserid();

    abstract boolean isConnected();

}
